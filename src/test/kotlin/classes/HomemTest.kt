package classes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HomemTest {
    val men = Homem(1.72, 73.21, 0)
    @Test
    fun tmb() {

        assertEquals(1815.000, men.tmb(25, 1.75,76.20))

    }
}