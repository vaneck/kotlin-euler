package euler

import kotlin.coroutines.experimental.buildSequence

fun fibonacci(): Sequence<Int> {
    // Stolen from somewhere because I didn't know how to use generateSequence yet.
    return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
}

/*
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
*/

fun factorize(n: Long): MutableList<Long> {
    // naive factorization.
    var number: Long = n
    val factors: MutableList<Long> = mutableListOf()
    for (factor in 2..n) {
        if (factor > number) {
            return factors
        }
        if (number.rem(factor) == 0L) {
            factors.add(factor)
            number /= factor
        }
    }
    return factors
}

fun version(): String = kotlin.KotlinVersion.CURRENT.toString()

fun isPalindrome(s: String): Boolean {
    val s2 = s.reversed()
    for (i in 0..(s.length/2)) {
        if (s[i] != s2[i]) {
            return false
        }
    }
    return true
}

fun nthPrime(n: Int): Int {
    val sieve = Sieve()
    // Not strictly needed as the sieve auto-resizes.
    sieve.size = 1000000

    var count = 0
    var num = 0
    while (count < n) {
        num++
        if (sieve.isPrime(num)) {
            count++
        }
    }
    return num
}

fun generateSubstrings(s: String, substringLength: Int): Sequence<String> = buildSequence {
    for (i in 0..s.length - substringLength) {
        yield(s.slice(i..i+substringLength - 1))
    }
}
