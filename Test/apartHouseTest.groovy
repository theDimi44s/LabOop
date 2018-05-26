import com.chnu.oop.lab6.house
import org.junit.jupiter.api.Test

class apartHouseTest extends GroovyTestCase {

    @Test
    void testToString() {

        assertEquals("Type of House: Apartment House | Type of Roof: non-typical | Rooms: 4 | Stages 9",house.toString())

    }
}
