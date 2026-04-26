package org.DesignPatterns.SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
          SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass.hashCode());
          singletonClass.display();

          SingletonClass singletonClass1 = SingletonClass.getInstance();
         System.out.println(singletonClass1.hashCode());


         // how to brek Singleton Design Pattern

        // using reflection api

        Constructor<SingletonClass> singleton =  SingletonClass.class.getDeclaredConstructor();
        singleton.setAccessible(true);
        SingletonClass singletonClass2 = singleton.newInstance();
        System.out.println(singletonClass2.hashCode());

        // how to overcome from this problem
        // if there is already object is created then throw the exception from Singleton class constructor...


        // Bill Pugh

        SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();

        System.out.println(singletonBillPugh.hashCode() == singletonBillPugh2.hashCode());

    }
}
