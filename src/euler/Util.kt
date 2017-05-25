package euler

import kotlin.coroutines.experimental.buildSequence

fun fetchProblemDescription(): String {
    return "Not implemented."
}

fun fibonacci(): Sequence<Int> {
    // Stolen from somewhere because I didn't know how to use generateSequence yet.
    return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
}

fun naturals(): Sequence<Int> {
    return generateSequence(1, {it + 1})
}

fun naturalsFromGenerator() = buildSequence {
    var n = 1
    while (true) {
        yield(n)
        n+=1
    }
}

fun factorize(n: Long): MutableList<Long> {
    // naive factorization.
    var number: Long = n
    var factors: MutableList<Long> = mutableListOf()
    for (factor in 2..n) {
        if (factor > number) {
            return factors
        }
        if (number.rem(factor) == 0L) {
            factors.add(factor)
            number = number/factor
        }
    }
    return factors
}

fun version(): String = kotlin.KotlinVersion.CURRENT.toString()
