package ru.itmo.fl.lang.visitor

import hu.webarticum.treeprinter.SimpleTreeNode
import hu.webarticum.treeprinter.TreeNode
import ru.itmo.fl.lang.tree.NumberExpression
import ru.itmo.fl.lang.tree.TreeElement
import ru.itmo.fl.lang.tree.Variable

/**
 * Convert program tree intermediate representation
 * from [ru.itmo.fl.lang.tree] to [TreeNode] representation
 * that can be printed in multiple ways.
 */
object PrintableTreeConverter : TreeVisitor<Nothing?, TreeNode>() {
    override fun visitElement(element: TreeElement, data: Nothing?): TreeNode {
        return SimpleTreeNode(element::class.simpleName).also { node ->
            element.acceptChildren(this, data).forEach { child ->
                node.addChild(child)
            }
        }
    }

    override fun visitVariable(variable: Variable, data: Nothing?): TreeNode =
        SimpleTreeNode("(var ${variable.name})")

    override fun visitNumberExpression(numberExpression: NumberExpression, data: Nothing?): TreeNode =
        SimpleTreeNode(numberExpression.value.toString())
}