package euler

val problems = listOf(
        ::p1,
        ::p2,
        ::p3,
        ::p4,
        ::p5,
        ::p6,
        ::p7
)

fun main(args: Array<String>) {
    println("Kotlin version: ${version()}")
    for (problem in problems) {
        println("==========================================")
        println("Euler problem: ${problem.name}")
        println("Answer to ${problem.name}: ${problem()}.")
    }
}

