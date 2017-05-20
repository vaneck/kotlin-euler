package euler

fun p1(): Int {
    var acc = 0
    for (n in 1..1000) {
        acc += if (n.rem(3) == 0 || n.rem(5) == 0) n else 0
    }
    return acc
}

fun p2(): Int {
    // Placeholder.
    return 0
}