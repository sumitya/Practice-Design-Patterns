package org.example.decorator;

public class Milk extends TasteDecorator{
    public Milk(Beverage beverage) {this.beverage = beverage; }
    public double cost() {
        return .10 + beverage.cost();
    }

    public String getDesc() {
        return beverage.getDesc() + " Milk ";
    }

}
