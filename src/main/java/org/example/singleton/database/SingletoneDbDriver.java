package org.example.singleton.database;

import org.example.singleton.classic.Singleton;

public class SingletoneDbDriver {
    public static void main(String[] args) {
        Singleton db1 = SingletonDbConn.getInstance();
        Singleton db2 = SingletonDbConn.getInstance();

        System.out.println(db1.getDesc());
        System.out.println(db2.getDesc());
    }
}
