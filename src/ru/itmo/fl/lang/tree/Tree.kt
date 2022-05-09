package ru.itmo.fl.lang.tree

import ru.itmo.fl.lang.util.ProgramState
import ru.itmo.fl.lang.visitor.ExpressionEvaluationVisitor
import ru.itmo.fl.lang.visitor.TreeVisitor

abstract class TreeElement {
    open fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitElement(this, data)
    
    abstract val children: List<TreeElement>

    fun <D, R> acceptChildren(visitor: TreeVisitor<D, R>, data: D): List<R> =
        children.map { it.accept(visitor, data) }
}

data class Program(val statements: List<Statement>): TreeElement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitProgram(this, data)

    override val children: List<TreeElement>
        get() = statements
}

sealed class Statement : TreeElement()

data class Assignment(
    val variable: Variable,
    val value: Expression
) : Statement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitAssignment(this, data)

    override val children: List<TreeElement>
        get() = listOf(variable, value)
}

data class IfStatement(
    val condition: Expression,
    val thenBlock: Block,
    val elseBlock: Block? = null
) : Statement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitIfStatement(this, data)

    override val children: List<TreeElement>
        get() = buildList { 
            this += condition
            this += thenBlock
            if (elseBlock != null) {
                this += elseBlock
            }
        }
}

data class WhileLoop(
    val condition: Expression,
    val block: Block
) : Statement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitWhileLoop(this, data)

    override val children: List<TreeElement>
        get() = listOf(condition, block)
}

object InputFunction : Statement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitInputFunction(this, data)

    override val children: List<TreeElement>
        get() = emptyList()
}

data class PrintFunction(val argument: Expression) : Statement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitPrintFunction(this, data)

    override val children: List<TreeElement>
        get() = listOf(argument)
}

data class Comment(val text: String) : Statement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitComment(this, data)

    override val children: List<TreeElement>
        get() = emptyList()
}

// block

data class Block(val statements: List<Statement>) : TreeElement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitBlock(this, data)

    override val children: List<TreeElement>
        get() = statements
}

// expressions

sealed class Expression : Statement() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitExpression(this, data)

    fun evaluate(state: ProgramState): Any =
        accept(ExpressionEvaluationVisitor, state)
}

sealed class BinaryExpression : Expression() {
    abstract val left: Expression
    abstract val right: Expression

    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitBinaryExpression(this, data)

    override val children: List<TreeElement>
        get() = listOf(left, right)
}

sealed class UnaryExpression : Expression() {
    abstract val argument: Expression

    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitUnaryExpression(this, data)

    override val children: List<TreeElement>
        get() = listOf(argument)
}

data class PowExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitPowExpression(this, data)
}

data class UnaryMinusExpression(
    override val argument: Expression
) : UnaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitUnaryMinusExpression(this, data)
}

data class MulExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitMulExpression(this, data)
}

data class DivExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitDivExpression(this, data)
}

data class AddExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitAddExpression(this, data)
}

data class SubExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitSubExpression(this, data)
}

data class EqualsExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitEqualsExpression(this, data)
}

data class NotEqualsExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitNotEqualsExpression(this, data)
}

data class LeqExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitLeqExpression(this, data)
}

data class LessExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitLessExpression(this, data)
}

data class GeqExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitGeqExpression(this, data)
}

data class GreaterExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitGreaterExpression(this, data)
}

data class NotExpression(
    override val argument: Expression
) : UnaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitNotExpression(this, data)
}

data class AndExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitAndExpression(this, data)
}

data class OrExpression(
    override val left: Expression,
    override val right: Expression
) : BinaryExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitOrExpression(this, data)
}

// simple expressions

sealed class SimpleExpression : Expression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitSimpleExpression(this, data)
}

data class Variable(val name: String) : SimpleExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitVariable(this, data)

    override val children: List<TreeElement>
        get() = emptyList()
}

data class NumberExpression(val value: Int) : SimpleExpression() {
    override fun <D, R> accept(visitor: TreeVisitor<D, R>, data: D): R =
        visitor.visitNumberExpression(this, data)

    override val children: List<TreeElement>
        get() = emptyList()
}
