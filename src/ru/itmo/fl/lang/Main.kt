package ru.itmo.fl.lang

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import ru.itmo.fl.lang.antlr.LangLexer
import ru.itmo.fl.lang.antlr.LangParser
import ru.itmo.fl.lang.util.PrintMode
import ru.itmo.fl.lang.util.ProgramState
import ru.itmo.fl.lang.visitor.PrintableTreeConverter
import ru.itmo.fl.lang.visitor.ProgramRunVisitor

fun main(args: Array<String>) {
    @Suppress("NAME_SHADOWING")
    val args = args.toList().toMutableList()

    if (args.isEmpty() || args.size > 3) {
        println("Unexpected number of arguments: ${args.size}")
        printUsage()
        return
    }

    if ("-run" in args) {
        require(args.size == 2) { "Run command must contain exactly 2 arguments" }
        val filename = args[1 - args.indexOf("-run")]
        runProgram(filename)
        return
    }

    if ("-print" in args) {
        require(args.size == 2 || args.size == 3) { "Print command must contain either 1 or 3 arguments" }
        val idx = args.indexOf("-print")
        val filename = when (args.size) {
            2 -> if (idx == 0) args[1] else args[0]
            3 -> if (idx == 0) args[2] else args[0]
            else -> error("Unexpected number of arguments: ${args.size}")
        }
        val mode = when (args.size) {
            2 -> PrintMode.defaultMode()
            3 -> PrintMode.fromString(args[idx + 1])
            else -> error("Unexpected arguments number: ${args.size}")
        }
        printProgram(filename, mode)
        return
    }

    println("Incorrect command syntax")
    printUsage()
}

private fun printUsage() {
    println("Usage:")
    println("./lang.sh [filename] (-print [list|box|tree]? | -run)")
}

private fun runProgram(fileName: String) {
    val parser = createParser(fileName)
    val program = parser.program().prog
    program.accept(ProgramRunVisitor, ProgramState())
}

private fun printProgram(fileName: String, mode: PrintMode) {
    val parser = createParser(fileName)
    val program = parser.program().prog
    val root = program.accept(PrintableTreeConverter, null)
    println(mode.print(root))
}

private fun createParser(fileName: String): LangParser {
    val input = CharStreams.fromFileName(fileName)
    val lexer = LangLexer(input)
    lexer.removeErrorListeners()
    val tokens = CommonTokenStream(lexer)
    return LangParser(tokens)
}