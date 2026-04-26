package org.example;

/**
 * Клас нащадок {@link Amunition} який описує елемент амуніції - шолом
 */
public class Helmet extends Amunition{

    private final String material;

    /**
     * Конструктор для створення нового екземпляру
     * @param name назва шолома
     * @param weight вага шолома
     * @param price ціна шолома
     * @param material матеріал з якого зроблено шолом
     */
    public Helmet(String name, double weight, double price, String material) {

        super(name, weight, price);

        this.material = material;
    }

    /**
     * Отримує назву матеріалу
     * @return назва матеріалу
     */
    public String getMaterial() {return this.material;}

    /**
     * Перетворює всі характеристики екземпляра на рядок
     * @return рядок з назвою екземпляра та його параметрів
     */
    @Override
    public String toString() {
        return this.getName() + ": вага - " + this.getWeight() + ", ціна - " + this.getPrice() + ", матеріал - " + this.getMaterial();
    }

}
