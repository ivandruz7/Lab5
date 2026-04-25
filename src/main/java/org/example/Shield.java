package org.example;

public class Shield extends Amunition{

    private double protection;

    public Shield(String name, double weight, double price, double protection) {

        super(name, weight, price);

        if (weight <= 0) {
            throw new IllegalArgumentException("Захист має бути більший за нуль");
        }
        this.protection = protection;
    }

    public double getProtection() {return this.protection;}

    @Override
    public String toString() {
        return this.getName() + ": вага - " + this.getWeight() + ", ціна - " + this.getPrice() + ", захист - " + this.protection;
    }
}
