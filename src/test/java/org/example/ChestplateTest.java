package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChestplateTest {

    @Test
    void constructorAndGetMaterial() {
        Chestplate test = new Chestplate("Простий нагрудник", 7.3, 29.0, "Залізо");

        assertEquals("Залізо", test.getMaterial());
    }

    @Test
    void testToString() {
        Chestplate test = new Chestplate("Простий нагрудник", 7.3, 29.0, "Залізо");

        assertEquals("Простий нагрудник: вага - 7.3, ціна - 29.0, матеріал - Залізо", test.toString());
    }
}