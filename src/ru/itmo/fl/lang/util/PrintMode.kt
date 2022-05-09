package ru.itmo.fl.lang.util

import hu.webarticum.treeprinter.TreeNode
import hu.webarticum.treeprinter.printer.TreePrinter
import hu.webarticum.treeprinter.printer.boxing.BoxingTreePrinter
import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter
import hu.webarticum.treeprinter.printer.traditional.TraditionalTreePrinter

sealed class PrintMode {
    abstract fun print(root: TreeNode): String

    companion object {
        fun fromString(mode: String): PrintMode =
            when (mode.lowercase()) {
                "list" -> ListingMode
                "box" -> BoxedMode
                "tree" -> TreeMode
                else -> error("Unknown print mode: $mode")
            }

        fun defaultMode(): PrintMode = ListingMode
    }

    protected fun TreeNode.printUsing(printer: TreePrinter) =
        StringBuilder().let { builder ->
            printer.print(this, builder)
            builder.toString()
        }
}

object ListingMode : PrintMode() {
    override fun print(root: TreeNode): String =
        root.printUsing(ListingTreePrinter())
}

object BoxedMode : PrintMode() {
    override fun print(root: TreeNode): String =
        root.printUsing(BoxingTreePrinter())
}

object TreeMode : PrintMode() {
    override fun print(root: TreeNode): String =
        root.printUsing(TraditionalTreePrinter())
}
