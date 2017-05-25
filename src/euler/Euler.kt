package euler

import kotlin.reflect.*

val problems = listOf(
        ::p1,
        ::p2,
        ::p3
)

fun main(args: Array<String>) {
    println("Kotlin version: ${version()}")
    var answer: Any
    for (problem in problems) {
        println("Problem name: ${problem.name}")
        answer = problem()
        println("Output of ${problem.name}: $answer.")
    }
}

