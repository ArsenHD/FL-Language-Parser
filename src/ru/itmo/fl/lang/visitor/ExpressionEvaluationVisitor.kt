package ru.itmo.fl.lang.visitor

import ru.itmo.fl.lang.tree.AddExpression
import ru.itmo.fl.lang.tree.AndExpression
import ru.itmo.fl.lang.tree.DivExpression
import ru.itmo.fl.lang.tree.EqualsExpression
import ru.itmo.fl.lang.tree.GeqExpression
import ru.itmo.fl.lang.tree.GreaterExpression
import ru.itmo.fl.lang.tree.InputFunction
import ru.itmo.fl.lang.tree.LeqExpression
import ru.itmo.fl.lang.tree.LessExpression
import ru.itmo.fl.lang.tree.MulExpression
import ru.itmo.fl.lang.tree.NotEqualsExpression
import ru.itmo.fl.lang.tree.NotExpression
import ru.itmo.fl.lang.tree.NumberExpression
import ru.itmo.fl.lang.tree.OrExpression
import ru.itmo.fl.lang.tree.PowExpression
import ru.itmo.fl.lang.tree.SubExpression
import ru.itmo.fl.lang.tree.TreeElement
import ru.itmo.fl.lang.tree.UnaryMinusExpression
import ru.itmo.fl.lang.tree.Variable
import ru.itmo.fl.lang.util.ProgramState
import kotlin.math.abs
import kotlin.math.pow

object ExpressionEvaluationVisitor : TreeVisitor<ProgramState, Any>() {
    override fun visitElement(element: TreeElement, data: ProgramState): Any {
        throw IllegalArgumentException("ExpressionEvaluationVisitor has reached the top of hierarchy")
    }

    override fun visitPowExpression(powExpression: PowExpression, data: ProgramState): Any {
        val (left, right) = powExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        return left.toDouble().pow(right.toDouble())
    }

    override fun visitUnaryMinusExpression(unaryMinusExpression: UnaryMinusExpression, data: ProgramState): Any {
        val argument = unaryMinusExpression.argument.accept(this, data)
        require(argument is Number)
        return -argument.toDouble()
    }

    override fun visitMulExpression(mulExpression: MulExpression, data: ProgramState): Any {
        val (left, right) = mulExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        return left.toDouble() * right.toDouble()
    }

    override fun visitDivExpression(divExpression: DivExpression, data: ProgramState): Any {
        val (left, right) = divExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        return left.toDouble() / right.toDouble()
    }

    override fun visitAddExpression(addExpression: AddExpression, data: ProgramState): Any {
        val (left, right) = addExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        return left.toDouble() + right.toDouble()
    }

    override fun visitSubExpression(subExpression: SubExpression, data: ProgramState): Any {
        val (left, right) = subExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        return left.toDouble() - right.toDouble()
    }

    override fun visitEqualsExpression(equalsExpression: EqualsExpression, data: ProgramState): Any {
        val (left, right) = equalsExpression.acceptChildren(this, data)
        return when {
            left is Number && right is Number -> abs(left.toDouble() - right.toDouble()) < EPS
            else -> left == right
        }
    }

    override fun visitNotEqualsExpression(notEqualsExpression: NotEqualsExpression, data: ProgramState): Any {
        val (left, right) = notEqualsExpression.acceptChildren(this, data)
        return when {
            left is Number && right is Number -> abs(left.toDouble() - right.toDouble()) >= EPS
            else -> left != right
        }
    }

    override fun visitLeqExpression(leqExpression: LeqExpression, data: ProgramState): Any {
        val (left, right) = leqExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        val ld = left.toDouble()
        val rd = right.toDouble()
        return ld < rd || abs(ld - rd) < EPS
    }

    override fun visitLessExpression(lessExpression: LessExpression, data: ProgramState): Any {
        val (left, right) = lessExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        return left.toDouble() < right.toDouble()
    }

    override fun visitGeqExpression(geqExpression: GeqExpression, data: ProgramState): Any {
        val (left, right) = geqExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        val ld = left.toDouble()
        val rd = right.toDouble()
        return ld > rd || abs(ld - rd) < EPS
    }

    override fun visitGreaterExpression(greaterExpression: GreaterExpression, data: ProgramState): Any {
        val (left, right) = greaterExpression.acceptChildren(this, data)
        require(left is Number)
        require(right is Number)
        return left.toDouble() > right.toDouble()
    }

    override fun visitNotExpression(notExpression: NotExpression, data: ProgramState): Any {
        val value = notExpression.argument.accept(this, data)
        require(value is Boolean)
        return !value
    }

    override fun visitAndExpression(andExpression: AndExpression, data: ProgramState): Any {
        val (left, right) = andExpression.acceptChildren(this, data)
        require(left is Boolean)
        require(right is Boolean)
        return left && right
    }

    override fun visitOrExpression(orExpression: OrExpression, data: ProgramState): Any {
        val (left, right) = orExpression.acceptChildren(this, data)
        require(left is Boolean)
        require(right is Boolean)
        return left || right
    }

    override fun visitVariable(variable: Variable, data: ProgramState): Any {
        return data[variable.name] ?: error("Undefined variable: ${variable.name}")
    }

    override fun visitNumberExpression(numberExpression: NumberExpression, data: ProgramState): Any {
        return numberExpression.value.toDouble()
    }

    override fun visitInputFunction(inputFunction: InputFunction, data: ProgramState): Any {
        return readLine()!!.toInt()
    }

    private const val EPS = 1e-9
}
