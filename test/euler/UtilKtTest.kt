package euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class UtilKtTest {

    @Test fun factorize() {
        Assertions.assertEquals(mutableListOf(2L, 5L), factorize(10L))
        Assertions.assertEquals(mutableListOf(5L, 7L, 13L, 29L), factorize(13195L))
    }

    @Test fun isPalindrome() {
        Assertions.assertTrue(isPalindrome("9"), "9")
        Assertions.assertTrue(isPalindrome("99"), "99")
        Assertions.assertTrue(isPalindrome("909"), "909")
        Assertions.assertTrue(isPalindrome("9009"), "9009")
        Assertions.assertTrue(isPalindrome("12344321"), "12344321")
        Assertions.assertFalse(isPalindrome("990"), "990")
        Assertions.assertFalse(isPalindrome("12341234"), "12341234")
    }

    @Test fun nthPrime() {
        Assertions.assertEquals(13, nthPrime(6))
    }

}