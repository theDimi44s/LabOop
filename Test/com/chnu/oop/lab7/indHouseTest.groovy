package com.chnu.oop.lab7

import com.chnu.oop.lab6.house
import org.junit.jupiter.api.Test

class indHouseTest extends GroovyTestCase {
    @Test
    void testToString() {

        assertEquals("Type of House: Individual House | Type of Roof: typical | Rooms: 10 | Stages 2",house.toString())

    }
}
