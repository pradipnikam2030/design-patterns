package org.DesignPatterns.creational.SingletonPattern;

public class SingletonBillPugh {
    private SingletonBillPugh (){
        System.out.println("Singleton Bill Pugh");
    }

    private static class Helper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance(){
        return Helper.INSTANCE;
    }
}
