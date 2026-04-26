package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwordTest {

    @Test
    void illegalArgumentExceptionTestConstructor() {
        assertThrows(IllegalArgumentException.class, () ->
        {new Sword("Простий меч", 0.9, 75.0, -25.0);},
                "Має бути виняток, бо шкода від'ємна");
    }

    @Test
    void testConstructorAndGetDamage() {
        Sword test = new Sword("Простий меч", 0.9, 75.0, 25.0);
        assertEquals(25.0, test.getDamage());
    }

    @Test
    void testToString() {
        Sword test = new Sword("Простий меч", 0.9, 75.0, 25.0);
        assertEquals("Простий меч: вага - 0.9, ціна - 75.0, шкода - 25.0", test.toString());
    }
}