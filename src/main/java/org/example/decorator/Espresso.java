package org.example.decorator;

public class Espresso extends Beverage{
    public Espresso(){ desc = "Espresso Coffee"; }
    public double cost() {
        return 1.99;
    }
}