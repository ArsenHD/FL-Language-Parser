package ru.itmo.fl.lang.visitor

import ru.itmo.fl.lang.tree.AddExpression
import ru.itmo.fl.lang.tree.AndExpression
import ru.itmo.fl.lang.tree.Assignment
import ru.itmo.fl.lang.tree.BinaryExpression
import ru.itmo.fl.lang.tree.Block
import ru.itmo.fl.lang.tree.Comment
import ru.itmo.fl.lang.tree.DivExpression
import ru.itmo.fl.lang.tree.EqualsExpression
import ru.itmo.fl.lang.tree.Expression
import ru.itmo.fl.lang.tree.GeqExpression
import ru.itmo.fl.lang.tree.GreaterExpression
import ru.itmo.fl.lang.tree.IfStatement
import ru.itmo.fl.lang.tree.InputFunction
import ru.itmo.fl.lang.tree.LeqExpression
import ru.itmo.fl.lang.tree.LessExpression
import ru.itmo.fl.lang.tree.MulExpression
import ru.itmo.fl.lang.tree.NotEqualsExpression
import ru.itmo.fl.lang.tree.NotExpression
import ru.itmo.fl.lang.tree.NumberExpression
import ru.itmo.fl.lang.tree.OrExpression
import ru.itmo.fl.lang.tree.PowExpression
import ru.itmo.fl.lang.tree.PrintFunction
import ru.itmo.fl.lang.tree.Program
import ru.itmo.fl.lang.tree.SimpleExpression
import ru.itmo.fl.lang.tree.Statement
import ru.itmo.fl.lang.tree.SubExpression
import ru.itmo.fl.lang.tree.TreeElement
import ru.itmo.fl.lang.tree.UnaryExpression
import ru.itmo.fl.lang.tree.UnaryMinusExpression
import ru.itmo.fl.lang.tree.Variable
import ru.itmo.fl.lang.tree.WhileLoop

abstract class TreeVisitor<in D, out R> {
    abstract fun visitElement(element: TreeElement, data: D): R

    // program
    open fun visitProgram(program: Program, data: D): R = visitElement(program, data)

    // statements
    open fun visitStatement(statement: Statement, data: D): R = visitElement(statement, data)

    open fun visitAssignment(assignment: Assignment, data: D): R = visitElement(assignment, data)

    open fun visitIfStatement(ifStatement: IfStatement, data: D): R = visitElement(ifStatement, data)

    open fun visitWhileLoop(whileLoop: WhileLoop, data: D): R = visitElement(whileLoop, data)

    open fun visitInputFunction(inputFunction: InputFunction, data: D): R = visitElement(inputFunction, data)

    open fun visitPrintFunction(printFunction: PrintFunction, data: D): R = visitElement(printFunction, data)

    open fun visitComment(comment: Comment, data: D): R = visitElement(comment, data)

    open fun visitBlock(block: Block, data: D): R = visitElement(block, data)

    // expressions
    open fun visitExpression(expression: Expression, data: D): R = visitElement(expression, data)

    open fun visitBinaryExpression(binaryExpression: BinaryExpression, data: D): R = visitElement(binaryExpression, data)

    open fun visitUnaryExpression(unaryExpression: UnaryExpression, data: D): R = visitElement(unaryExpression, data)

    open fun visitPowExpression(powExpression: PowExpression, data: D): R = visitElement(powExpression, data)

    open fun visitUnaryMinusExpression(unaryMinusExpression: UnaryMinusExpression, data: D): R = visitElement(unaryMinusExpression, data)

    open fun visitMulExpression(mulExpression: MulExpression, data: D): R = visitElement(mulExpression, data)

    open fun visitDivExpression(divExpression: DivExpression, data: D): R = visitElement(divExpression, data)

    open fun visitAddExpression(addExpression: AddExpression, data: D): R = visitElement(addExpression, data)

    open fun visitSubExpression(subExpression: SubExpression, data: D): R = visitElement(subExpression, data)

    open fun visitEqualsExpression(equalsExpression: EqualsExpression, data: D): R = visitElement(equalsExpression, data)

    open fun visitNotEqualsExpression(notEqualsExpression: NotEqualsExpression, data: D): R = visitElement(notEqualsExpression, data)

    open fun visitLeqExpression(leqExpression: LeqExpression, data: D): R = visitElement(leqExpression, data)

    open fun visitLessExpression(lessExpression: LessExpression, data: D): R = visitElement(lessExpression, data)

    open fun visitGeqExpression(geqExpression: GeqExpression, data: D): R = visitElement(geqExpression, data)

    open fun visitGreaterExpression(greaterExpression: GreaterExpression, data: D): R = visitElement(greaterExpression, data)

    open fun visitNotExpression(notExpression: NotExpression, data: D): R = visitElement(notExpression, data)

    open fun visitAndExpression(andExpression: AndExpression, data: D): R = visitElement(andExpression, data)

    open fun visitOrExpression(orExpression: OrExpression, data: D): R = visitElement(orExpression, data)

    // simple expressions

    open fun visitSimpleExpression(simpleExpression: SimpleExpression, data: D): R = visitElement(simpleExpression, data)

    open fun visitVariable(variable: Variable, data: D): R = visitElement(variable, data)

    open fun visitNumberExpression(numberExpression: NumberExpression, data: D): R = visitElement(numberExpression, data)
}
