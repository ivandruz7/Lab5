package org.example;

public class Helmet extends Amunition{

    private String material;

    public Helmet(String name, double weight, double price, String material) {

        super(name, weight, price);

        this.material = material;

    }

    public String getMaterial() {return this.material;}

    @Override
    public String toString() {
        return this.getName() + ": вага - " + this.getWeight() + ", ціна - " + this.getPrice() + ", матеріал - " + this.getMaterial();
    }

}
