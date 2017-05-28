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

/**
 * 10001st prime number.
 */
fun p7(): Int {
    return nthPrime(10001)
}

fun p8(): Int {
    var number = "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "7163626956188267042825248360082325753042075296345"
    // return allSubstrings(number, 13).map(Int).sum()
    return 0
}

