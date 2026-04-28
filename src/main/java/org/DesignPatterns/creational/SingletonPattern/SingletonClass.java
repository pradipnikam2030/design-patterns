package org.DesignPatterns.creational.SingletonPattern;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass(){
        System.out.println("constructor is called");
    }

    public static SingletonClass getInstance(){
         if (singletonClass == null){
             synchronized (SingletonClass.class){
                if (singletonClass == null){
                    singletonClass = new SingletonClass();
                }
             }
         }
         return singletonClass;
    }

    public void display(){
        System.out.println("Display method is called...");
    }
}
