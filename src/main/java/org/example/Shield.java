package org.example;

/**
 * Клас нащадок {@link Amunition} який описує елемент амуніції - меч
 */
public class Shield extends Amunition{

    private final double protection;

    /**
     * Конструктор для створення нового екземпляру
     * @param name назва щита
     * @param weight вага щита
     * @param price ціна щита
     * @param protection захист щита
     */
    public Shield(String name, double weight, double price, double protection) {

        super(name, weight, price);

        if (protection <= 0) {
            throw new IllegalArgumentException("Захист має бути більший за нуль");
        }
        this.protection = protection;
    }

    /**
     * Отримує значення яке показує захист щита
     * @return захист щита
     */
    public double getProtection() {return this.protection;}

    /**
     * Перетворює всі характеристики екземпляра на рядок
     * @return рядок з назвою екземпляра та його параметрів
     */
    @Override
    public String toString() {
        return this.getName() + ": вага - " + this.getWeight() + ", ціна - " + this.getPrice() + ", захист - " + this.protection;
    }
}
