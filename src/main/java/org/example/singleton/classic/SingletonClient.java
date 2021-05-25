package org.example.singleton.classic;

public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDesc());

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getDesc());
    }
}
