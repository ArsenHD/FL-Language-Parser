package ru.itmo.fl.lang.util

class ProgramState(
    private val variables: MutableMap<String, Any> = mutableMapOf()
) {
    operator fun get(name: String) = variables[name]

    operator fun set(name: String, value: Any) {
        variables[name] = value
    }
}