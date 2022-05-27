import classes.Mulher
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


internal class MulherTest {
    val mulher = Mulher(1.62, 62.20, 19, "Fernanda")

    @Test
    fun tmb() {

            assertEquals( 1475.00, mulher.tmb(1.65, 62.25, 18))
    }
}