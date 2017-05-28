package euler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UtilKtTest {

    @Test fun factorize() {
        assertEquals(mutableListOf(2L, 5L), factorize(10L))
        assertEquals(mutableListOf(5L, 7L, 13L, 29L), factorize(13195L))
    }

    @Test fun isPalindrome() {
        assertTrue(isPalindrome("9"), "9")
        assertTrue(isPalindrome("99"), "99")
        assertTrue(isPalindrome("909"), "909")
        assertTrue(isPalindrome("9009"), "9009")
        assertTrue(isPalindrome("12344321"), "12344321")
        assertFalse(isPalindrome("990"), "990")
        assertFalse(isPalindrome("12341234"), "12341234")
    }

    @Test fun nthPrime() {
        assertEquals(13, nthPrime(6))
    }

    @Test fun generateSubstrings() {
        var s = "abcdef"
        assertEquals(listOf("a", "b", "c", "d", "e", "f"), generateSubstrings(s, 1).toList())
        assertEquals(listOf("ab", "bc", "cd", "de", "ef"), generateSubstrings(s, 2).toList())
        assertEquals(listOf("abc", "bcd", "cde", "def"), generateSubstrings(s, 3).toList())
        assertEquals(listOf("abcd", "bcde", "cdef"), generateSubstrings(s, 4).toList())
        assertEquals(listOf("abcde", "bcdef"), generateSubstrings(s, 5).toList())
        assertEquals(listOf("abcdef"), generateSubstrings(s, 6).toList())
        assertEquals(emptyList<String>(), generateSubstrings(s, 7).toList())
    }

}