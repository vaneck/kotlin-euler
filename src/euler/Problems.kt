package euler

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
