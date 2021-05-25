package org.example.factory.pizza;

public class PizzaSimulator {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName());
        System.out.println(pizza);

    }
}
