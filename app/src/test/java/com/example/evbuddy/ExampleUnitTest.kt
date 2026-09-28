package com.example.evbuddy

import com.example.evbuddy.models.Driver
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun driver_copy_preservesUnchangedFields() {
        val driver = Driver("Alice", "Tesla Model S", "ABC123")
        val copy = driver.copy(name = "Alicia")

        assertEquals("Alicia", copy.name)
        assertEquals("Tesla Model S", copy.vehicleModel)
        assertEquals("ABC123", copy.licensePlate)
    }

    @Test
    fun drivers_withSameFields_areEqual() {
        assertEquals(
            Driver("Bob", "Nissan Leaf", "XYZ789"),
            Driver("Bob", "Nissan Leaf", "XYZ789")
        )
    }
}