package org.example;

/**
 * Головний клас амуніції від якого наслідуються всі класи амуніції
 */
public abstract class Amunition {

    private final String name;
    private final double weight;
    private final double price;

    /**
     * Конструктор для створення нового екземпляру
     * @param name назва амуніції
     * @param weight вага амуніції
     * @param price ціна амуніції
     */
    public Amunition(String name, double weight, double price) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вага має бути більшою за нуль");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною");
        }
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    /**
     * Отримує назву амуніції
     * @return назва амуніції
     */
    public String getName() {return this.name;}

    /**
     * Отримує вагу амуніції
     * @return вага амуніції
     */
    public double getWeight() {return this.weight;}

    /**
     * Отримує ціну амуніції
     * @return ціна амуніції
     */
    public double getPrice() {return this.price;}
}
