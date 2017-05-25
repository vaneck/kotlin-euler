package euler

import org.junit.jupiter.api.*

internal class UtilKtTest {

    @Test fun factorize() {
        Assertions.assertEquals(mutableListOf(2L, 5L), factorize(10L))
        Assertions.assertEquals(mutableListOf(5L, 7L, 13L, 29L), factorize(13195L))
    }

}