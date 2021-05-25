package org.example.strategy;

//concrete duck
public class MallardDuck extends Duck {

    void display() {
        System.out.println("I am the Mallard Duck!");
    }

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
