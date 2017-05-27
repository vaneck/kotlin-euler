package euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SieveTest {

    @Test fun autoResize() {
        var sieve = Sieve()
        for (n in listOf(2, 17, 37, 89, 97)) {
            Assertions.assertTrue(sieve.isPrime(n), "$n")
        }
        for (n in listOf(0, 1, 98, 99, 100)) {
            Assertions.assertFalse(sieve.isPrime(n), "$n")
        }
    }

    @Test fun manualResize() {
        var sieve = Sieve()
        sieve.size = 1000
        for (n in listOf(2, 17, 37, 89, 97)) {
            Assertions.assertTrue(sieve.isPrime(n), "$n")
        }
        sieve.size = 5
        for (n in listOf(0, 1, 98, 99, 100)) {
            Assertions.assertFalse(sieve.isPrime(n), "$n")
        }
    }

    @Test fun biggishPrimes() {
        var sieve = Sieve()
        for (n in listOf(15485867)) {
            Assertions.assertTrue(sieve.isPrime(n), "$n")
        }
        for (n in listOf(15485866)) {
            Assertions.assertFalse(sieve.isPrime(n), "$n")
        }
    }
}

