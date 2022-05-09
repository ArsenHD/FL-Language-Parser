package ru.itmo.fl.lang.visitor

import ru.itmo.fl.lang.tree.Assignment
import ru.itmo.fl.lang.tree.Block
import ru.itmo.fl.lang.tree.Expression
import ru.itmo.fl.lang.tree.IfStatement
import ru.itmo.fl.lang.tree.InputFunction
import ru.itmo.fl.lang.tree.PrintFunction
import ru.itmo.fl.lang.tree.Program
import ru.itmo.fl.lang.tree.TreeElement
import ru.itmo.fl.lang.tree.WhileLoop
import ru.itmo.fl.lang.util.ProgramState

object ProgramRunVisitor : TreeVisitor<ProgramState, Unit>() {
    override fun visitElement(element: TreeElement, data: ProgramState) {
        throw IllegalArgumentException("ProgramRunVisitor has reached the top of hierarchy")
    }

    override fun visitProgram(program: Program, data: ProgramState) {
        program.acceptChildren(this, data)
    }

    override fun visitAssignment(assignment: Assignment, data: ProgramState) {
        val (variable, value) = assignment
        data[variable.name] = value.evaluate(data)
    }

    override fun visitIfStatement(ifStatement: IfStatement, data: ProgramState) {
        val condition = ifStatement.condition.toBoolean(data)
        if (condition) {
            ifStatement.thenBlock.accept(this, data)
        } else {
            ifStatement.elseBlock?.accept(this, data)
        }
    }

    override fun visitWhileLoop(whileLoop: WhileLoop, data: ProgramState) {
        while (true) {
            val condition = whileLoop.condition.toBoolean(data)
            if (condition) {
                whileLoop.block.accept(this, data)
            } else {
                break
            }
        }
    }

    override fun visitInputFunction(inputFunction: InputFunction, data: ProgramState) {
        readLine()!!.toInt()
    }

    override fun visitPrintFunction(printFunction: PrintFunction, data: ProgramState) {
        println(printFunction.argument.evaluate(data))
    }

    override fun visitBlock(block: Block, data: ProgramState) {
        block.acceptChildren(this, data)
    }

    private fun Expression.toBoolean(state: ProgramState): Boolean {
        return evaluate(state)
            .let { it as? Boolean ?: error("Expected Boolean, but got: ${it::class.simpleName}") }
    }
}
