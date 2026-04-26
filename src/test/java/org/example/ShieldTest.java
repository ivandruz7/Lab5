package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShieldTest {

    @Test
    void illegalArgumentExceptionTestConstructor() {
        assertThrows(IllegalArgumentException.class, () ->
                {new Shield("Простий щит", 3.0, 50.0, -30.0);},
                "Має бути виняток, бо захист від'ємний");
    }

    @Test
    void testConstructorAndGetDamage() {
        Shield test = new Shield("Простий щит", 3.0, 50.0, 30.0);
        assertEquals(30.0, test.getProtection());
    }

    @Test
    void testToString() {
        Shield test = new Shield("Простий щит", 3.0, 50.0, 30.0);
        assertEquals("Простий щит: вага - 3.0, ціна - 50.0, захист - 30.0", test.toString());
    }
}