package euler

/**
 * Relatively naive implementation of the sieve of Eratosthenes.
 *
 * Not very space efficient as the backing data structure is an ArrayList.
 * Not thread-safe.
 *
 * Usage:
 *
 *     var sieve = Sieve()
 *     sieve.isPrime(97) // true
 *
 * Additionally sieve.size can be set prior to calls to isPrime to the max prime to be
 * queried to prevent background resizes/recalculations (the sieve needs to be rerun if
 * a prime greater than its current capacity is queried).
 *
 */
class Sieve {
    var _sieve = MutableList<Boolean>(0, {false})
    var size = 0
        set(value) {
            _resize(value)
            _filter()
            field = value
        }

    /**
     * Runs the sieve to the current size to ensure only primes are left in it.
     *
     * Note that a full run is needed after every resize.
     *
     */
    fun _filter() {
        for ((i, value) in _sieve.withIndex()) {
            if (i < 2) {
                _sieve[i] = false
                continue
            }
            if (value) {
                for (j in i*2.._sieve.size-1 step i) {
                    _sieve[j] = false
                }
            }
        }
    }

    /**
     * Extends the backing array and initializes new values to true (presumed prime).
     */
    fun _resize(n: Int) {
        val delta = n - _sieve.size
        if (delta >= 0) {
            _sieve.addAll(generateSequence({ true }, { true }).take(delta))
        } else {
            _sieve = _sieve.slice(0..n).toMutableList()
        }
    }

    fun isPrime(n: Int): Boolean {
        // We need a sieve with size n+1 to be able to know about n.
        if (n+1 > size) {
            size = n+1
        }
        return _sieve[n]
    }
}
