package org.example.factory.pizza;

public class PizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheezePizaa();
        } else if(type.equals("cheese")){
            pizza = new CheezePizaa();
        }
        return pizza;
    }
}
