package org.example.strategy;

abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void setFlyBehavior(FlyBehavior fb) { flyBehavior = fb; }

    public void setQuackBehavior(QuackBehavior qb) { quackBehavior = qb; }

    public void performFly() { flyBehavior.fly(); }

    public void performQuack() { quackBehavior.Quack(); }

    public void swim() { System.out.println("Ducks, All float !");}

    abstract void display();
}
