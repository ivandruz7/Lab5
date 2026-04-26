package org.example;

/**
 * Клас нащадок {@link Amunition} який описує елемент амуніції - меч
 */
public class Sword extends Amunition{

    private final double damage;

    /**
     * Конструктор для створення нового екземпляру
     * @param name назва меча
     * @param weight вага меча
     * @param price ціна меча
     * @param damage шкода яку наносить меч
     */
    public Sword(String name, double weight, double price, double damage) {

        super(name, weight, price);

        if (damage <= 0) {
            throw new IllegalArgumentException("Шкода має бути більшою за нуль ");
        }
        this.damage = damage;
    }

    /**
     * Отримує шкоду яку наносить меч
     * @return шкода яку наносить меч
     */
    public double getDamage() {return this.damage;}

    /**
     * Перетворює всі характеристики екземпляра на рядок
     * @return рядок з назвою екземпляра та його параметрів
     */
    @Override
    public String toString() {
        return this.getName() + ": вага - " + this.getWeight() + ", ціна - " + this.getPrice() + ", шкода - " + this.damage;
    }
}
