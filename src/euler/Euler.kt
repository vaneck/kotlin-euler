package euler

val problems = listOf(
        ::p1,
        ::p2,
        ::p3,
        ::p4,
        ::p5,
        ::p6
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

