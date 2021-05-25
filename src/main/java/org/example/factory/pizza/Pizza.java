package org.example.factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName() {return name; }
    public void prepare(){ System.out.println("Preparing "+ name);}
    public void bake(){ System.out.println("Baking "+ name);}
    public void cut(){ System.out.println("Cutting "+ name);}
    public void box(){ System.out.println("Boxing "+ name);}

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
