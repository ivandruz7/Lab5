package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Клас лицаря який може екіпірувати амуніцію, рахувати вартість екіпірованої амуніції,
 * сортувати екіпіровану амуніцію по вазі, знаходити серед екіпірованої амуніції ту яка
 * входить в заданий діапазон ціни та виводити екіпіровану амуніцію.
 */
public class Knight {

    private final String name;
    private final List<Amunition> equipment;

    /**
     * Конструктор для створення нового екземпляру
     * @param name ім'я лицаря
     */
    public Knight(String name) {
        this.name = name;
        this.equipment = new ArrayList<>();
    }

    /**
     * Отримує ім'я лицаря
     * @return ім'я лицаря
     */
    public String getName() {return this.name;}

    /**
     * Екіпірує якийсь елемент амуніції
     * @param amunition елемент амуніції
     */
    public void equip(Amunition amunition) {

        if (amunition == null) {
            throw new NullPointerException("Неможливо екіпірувати порожній об'єкт (null).");
        }
        this.equipment.add(amunition);

    }

    /**
     * Рахує вартість всієї екіпірованої амуніції
     * @return вартість екіпірованої амуніції
     */
    public double calculateCostEquipment() {
        double costAmunition = 0;
        for (Amunition amunition : this.equipment) {
            costAmunition += amunition.getPrice();
        }
        return costAmunition;
    }

    /**
     * Сортує амуніцію по вазі
     */
    public void sortEquipment() {
        this.equipment.sort(Comparator.comparingDouble(Amunition::getWeight));
    }

    /**
     * Знаходить амуніцію яка входить в заданий діапазон вартості
     * @param from звідки починати пошук
     * @param to до скільки шукати
     * @return амуніція яка входить в заданий діапазон вартості
     */
    public List<Amunition> searchEquipmentByPriceRange(double from, double to) {
        if (from > to) {
            throw new IllegalArgumentException("Мінімальна ціна не може бути більшою за максимальну.");
        }
        List<Amunition>  result = new ArrayList<>();
        for (Amunition amunition : this.equipment) {
            if (amunition.getPrice() >= from && amunition.getPrice() <= to) {
                result.add(amunition);
            }
        }
        return result;
    }

    /**
     * Виводить ім'я лицаря та екіпіровану амуніцію
     */
    public void showEquipment() {
        System.out.println("Амуніція лицаря " + this.name + ": ");
        for (Amunition amunition : this.equipment) {
            System.out.println(amunition.toString());
        }
    }
}
