package org.example.decorator;

public abstract class TasteDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDesc();
}
