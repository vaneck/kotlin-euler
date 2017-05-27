package euler

import com.google.common.math.LongMath

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
    val palindromes: MutableList<Long> = mutableListOf()
    for (n in 100L..999L) {
        for (m in n..999L) {
            val product = n*m
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

/**
 * Sum square difference.
 */
fun p6(): Long {
    val sumOfSquares = (1..100L).map {it * it}.sum()
    val squareOfSums = LongMath.pow((1..100L).sum(), 2)
    return squareOfSums - sumOfSquares
}
