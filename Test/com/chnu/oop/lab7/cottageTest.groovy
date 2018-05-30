package com.chnu.oop.lab7

import com.chnu.oop.lab6.house
import org.junit.jupiter.api.Test

class cottageTest extends GroovyTestCase {

    @Test
    void testToString() {

        assertEquals("Type of House: Cottage | Type of Roof: non-typical | Rooms: 10 | Stages 3",house.toString())

    }
}
