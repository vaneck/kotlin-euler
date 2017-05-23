package euler

fun fetchProblemDescription(): String {
    return "Not implemented."
}

fun fibonacci(): Sequence<Int> {
    // Stolen from somewhere because I didn't know how to use generateSequence yet.
    return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
}
