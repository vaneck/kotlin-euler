package euler

import kotlin.system.measureTimeMillis

val problems = listOf(
        ::p1,
        ::p2,
        ::p3,
        ::p4,
        ::p5,
        ::p6,
        ::p7,
        ::p8,
        ::p9
)

fun main(args: Array<String>) {
    println("Kotlin version: ${version()}")
    for (problem in problems) {
        println("==========================================")
        println("Euler problem: ${problem.name}")
        var answer: Any = 0
        var time = measureTimeMillis({answer = problem()})
        println("Answer to ${problem.name}: ${answer}.")
        println("Took ${time}ms.")
    }
}

