package euler

val problems = listOf(
        ::p1,
        ::p2
)

fun main(args: Array<String>) {
    var answer: Int
    for (problem in problems) {
        answer = problem()
        println("Output of ${problem.name}: $answer.")
    }
}

