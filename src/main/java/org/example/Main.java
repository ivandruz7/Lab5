package org.example;

public class Main {

    public static void main(String[] args) {

        Knight artur = new Knight("Артур");

        Helmet helmet = new Helmet("Залізний шолом", 3.0, 50, "Залізо");
        Chestplate chestplate = new Chestplate("Залізний нагрудник", 10.0, 125, "Залізо");
        Sword sword = new Sword("Екскалібур", 1.1, 200, 400);
        Shield shield = new Shield("Тарч", 4.5, 45, 120);

        artur.equip(helmet);
        artur.equip(chestplate);
        artur.equip(sword);
        artur.equip(shield);

        // амуніція до сортування
        System.out.println();
        System.out.println("--------Амуніція до сортування--------");
        artur.showEquipment();
        System.out.println();

        // вартість амуніції
        System.out.println("------------------------");
        System.out.println("Вартість амуніції - " + artur.calculateCostEquipment());
        System.out.println();

        // амуніція після сортування
        System.out.println("--------Амуніція після сортування--------");
        artur.sortEquipment();
        artur.showEquipment();
        System.out.println();

        // елементи амуніції ціною від 100 до 200
        System.out.println("--------Амуніція ціною від 100 до 200--------");
        for (Amunition amunition : artur.searchEquipmentByPriceRange(100.0, 200.0)) {
            System.out.println(amunition.toString());
        }

    }
}