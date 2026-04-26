package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    private Knight knight;

    @BeforeEach
    void setUp() {
        knight = new Knight("Артур");
    }

    @Test
    void testCalculateCostEquipment() {

        knight.equip(new Sword("Меч", 2.0, 100.0, 50.0));
        knight.equip(new Shield("Щит", 5.0, 50.0, 20.0));

        assertEquals(150.0, knight.calculateCostEquipment(),
                "Сумарна вартість має дорівнювати 150.0");
    }

    @Test
    void testSortEquipment() {
        Amunition heavy = new Helmet("Важкий шолом", 10.0, 50, "Сталь");
        Amunition light = new Sword("Легкий ніж", 0.5, 20, 10);

        knight.equip(heavy);
        knight.equip(light);

        knight.sortEquipment();

        List<Amunition> results = knight.searchEquipmentByPriceRange(0, 1000);
        assertEquals("Легкий ніж", results.get(0).getName(),
                "Першим у списку має бути найлегший предмет");
    }

    @Test
    void testSearchEquipmentByPriceRange() {
        knight.equip(new Sword("Дорогий меч", 2.0, 500.0, 100));
        knight.equip(new Shield("Дешевий щит", 5.0, 50.0, 20));
        knight.equip(new Helmet("Середній шолом", 3.0, 150.0, "Бронза"));

        List<Amunition> found = knight.searchEquipmentByPriceRange(100.0, 400.0);

        assertEquals(1, found.size(), "Має бути знайдено рівно один предмет");
        assertEquals("Середній шолом", found.get(0).getName());
    }

    @Test
    void testSearchWithInvalidRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            knight.searchEquipmentByPriceRange(200.0, 100.0);
        }, "Має виникнути помилка, якщо мінімальна ціна більша за максимальну");
    }

    @Test
    void testEquipNull() {
        assertThrows(NullPointerException.class, () -> {
            knight.equip(null);
        }, "Програма має видавати помилку при спробі додати порожній об'єкт");
    }
}