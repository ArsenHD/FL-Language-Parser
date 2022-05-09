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
    if (args.size > 1) {
        println("Unexpected number of arguments: ${args.size}")
        println("Usage:")
        println("./runner.sh [filename]?")
        return
    }

    val input = when {
        args.isEmpty() -> CharStreams.fromStream(System.`in`)
        else -> CharStreams.fromFileName(args[0])
    }

    val lexer = LangLexer(input)
    lexer.removeErrorListeners()
    val tokens = CommonTokenStream(lexer)
    val parser = LangParser(tokens)

    val program = parser.program().prog
    program.accept(ProgramRunVisitor, ProgramState())
}
