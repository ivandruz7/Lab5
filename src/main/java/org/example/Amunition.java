package org.example;

public abstract class Amunition {

    private String name;
    private double weight;
    private double price;

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

    public String getName() {return this.name;}

    public double getWeight() {return this.weight;}

    public double getPrice() {return this.price;}
}
