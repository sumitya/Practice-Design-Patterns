package org.example.decorator;

public class Decaf extends Beverage{
    public Decaf(){ desc = "Decaf Coffee"; }
    public double cost() {
        return 1.05;
    }
}
