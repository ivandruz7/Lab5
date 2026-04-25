package org.example;

public class Sword extends Amunition{

    private double damage;

    public Sword(String name, double weight, double price, double damage) {

        super(name, weight, price);

        if (damage <= 0) {
            throw new IllegalArgumentException("Шкода має бути більшою за нуль ");
        }
        this.damage = damage;
    }

    public double getDamage() {return this.damage;}

    @Override
    public String toString() {
        return this.getName() + ": вага - " + this.getWeight() + ", ціна - " + this.getPrice() + ", шкода - " + this.damage;
    }
}
