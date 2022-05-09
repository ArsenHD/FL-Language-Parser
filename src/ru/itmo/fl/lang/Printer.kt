package ru.itmo.fl.lang

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import ru.itmo.fl.lang.antlr.LangLexer
import ru.itmo.fl.lang.antlr.LangParser
import ru.itmo.fl.lang.util.PrintMode
import ru.itmo.fl.lang.visitor.PrintableTreeConverter

fun main(args: Array<String>) {
    if (args.size > 3) {
        println("Unexpected number of arguments: ${args.size}")
        println("Usage:")
        println("./printer.sh [filename]? -mode [list|box|tree]?")
        return
    }

    @Suppress("NAME_SHADOWING")
    val args = args.toMutableList()

    val printMode = when ("-mode") {
        in args -> {
            val idx = args.indexOf("-mode")
            val mode = args[idx + 1].let { PrintMode.fromString(it) }
            args.removeAt(idx)
            args.removeAt(idx)
            mode
        }
        else -> PrintMode.defaultMode()
    }

    val input = when {
        args.isEmpty() || args.size == 2 -> CharStreams.fromStream(System.`in`)
        args.size == 1 -> CharStreams.fromFileName(args[0])
        args.size == 3 -> {
            val idx = args.indexOf("-mode")
            val fileName = if (idx == 0) args[2] else args[0]
            CharStreams.fromFileName(fileName)
        }
        else -> error("Unexpected number of arguments: ${args.size}")
    }

    val lexer = LangLexer(input)
    lexer.removeErrorListeners()
    val tokens = CommonTokenStream(lexer)
    val parser = LangParser(tokens)

    val program = parser.program().prog
    val root = program.accept(PrintableTreeConverter, null)
    println(printMode.print(root))
}
