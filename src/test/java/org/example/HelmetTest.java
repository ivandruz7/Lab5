package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelmetTest {

    @Test
    void testAmunitionConstructorThrowsExceptionForNegativeWeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Sword("Зламаний меч", -5.0, 100.0, 50.0);
        }, "Має бути виняток, бо вага від'ємна (логіка класу Amunition)");
    }

    @Test
    void testAmunitionConstructorThrowsExceptionForNegativePrice() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Helmet("Дірявий шолом", 2.0, -10.0, "Залізо");
        }, "Має бути виняток, бо ціна від'ємна (логіка класу Amunition)");
    }

    @Test
    void testAmunitionConstructor() {
        Helmet test = new Helmet("Простий шолом", 0.6, 25.0, "Сталь");
        assertEquals("Простий шолом",  test.getName());
        assertEquals(0.6, test.getWeight());
        assertEquals(25.0, test.getPrice());
        assertEquals("Сталь",  test.getMaterial());
    }

    @Test
    void testToString() {
        Helmet test = new Helmet("Простий шолом", 0.6, 25.0, "Сталь");

        assertEquals("Простий шолом: вага - 0.6, ціна - 25.0, матеріал - Сталь", test.toString());
    }
}