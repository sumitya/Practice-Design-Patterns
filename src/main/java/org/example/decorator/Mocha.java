package org.example.decorator;

public class Mocha extends TasteDecorator{
    public Mocha(Beverage beverage) {this.beverage = beverage; }
    public double cost() {
        return .20 + beverage.cost();
    }

    public String getDesc() {
        return beverage.getDesc() + " Mocha ";
    }
}
