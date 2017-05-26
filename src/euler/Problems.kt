package euler

import kotlin.coroutines.experimental.*

fun p1(): Int {
    var acc = 0
    for (n in 1..1000) {
        acc += if (n.rem(3) == 0 || n.rem(5) == 0) n else 0
    }
    return acc
}

fun p2(): Int {
    return fibonacci().filter({it % 2 == 0}).takeWhile({it < 4_000_000}).sum()
}


fun p3(): Long {
    // largest prime factor of 600851475143.
    val n = 600851475143L
    return factorize(n).last()
}

fun p4(): Long {
    var palindromes: MutableList<Long> = mutableListOf()
    for (n in 100L..999L) {
        for (m in n..999L) {
            var product = n*m
            if (isPalindrome(product.toString())) {
               palindromes.add(product)
            }
        }
    }
    return palindromes.max() ?: 0
}

fun p5(): Long {
    for (n: Long in generateSequence(6L, { it + 6L })) {
        if ((4..20).all({ n.rem(it) == 0L })) {
            return n
        }
    }
    return 0
}
