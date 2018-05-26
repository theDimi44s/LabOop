import com.chnu.oop.lab6.house
import org.junit.jupiter.api.Test


class houseTest extends GroovyTestCase {


    @Test
    void testToString() {
        assertEquals("Type of House: House | Type of Roof: typical | Rooms: 1 | Stages 1",house.toString())
    }

}
