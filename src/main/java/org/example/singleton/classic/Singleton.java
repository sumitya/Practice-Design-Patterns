package org.example.singleton.classic;

public class Singleton {
    private static Singleton oneInstance;
    private static int objCounter = 0 ;

    protected Singleton(){}

    public static Singleton getInstance(){
        if(oneInstance == null) {
            oneInstance = new Singleton();
            objCounter+=1;

        }

        return oneInstance;
    }

    public String getDesc() { return "Classic Singleton!! created " + objCounter +" time"; }
}
