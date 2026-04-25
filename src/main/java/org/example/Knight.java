package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Knight {

    private String name;
    private List<Amunition> equipment;

    public Knight(String name) {
        this.name = name;
        this.equipment = new ArrayList<>();
    }

    public String getName() {return this.name;}

    public void equip(Amunition amunition) {

        if (amunition == null) {
            throw new NullPointerException("Неможливо екіпірувати порожній об'єкт (null).");
        }
        this.equipment.add(amunition);

    }

    public double calculateCostEquipment() {
        double costAmunition = 0;
        for (Amunition amunition : this.equipment) {
            costAmunition += amunition.getPrice();
        }
        return costAmunition;
    }

    public void sortEquipment() {
        this.equipment.sort(Comparator.comparingDouble(Amunition::getWeight));
    }

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

    public void showEquipment() {
        System.out.println("Амуніція лицаря " + this.name + ": ");
        for (Amunition amunition : this.equipment) {
            System.out.println(amunition.toString());
        }
    }
}
