package org.example.decorator;

public class BuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDesc() + " ₹ "+beverage.cost());

        Beverage beverage1 = new Decaf();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDesc() + " ₹ "+beverage.cost());
    }
}
