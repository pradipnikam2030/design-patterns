package org.DesignPatterns.creational.SingletonPattern;

public enum SingletonEnum {
    INSTANCE;

    public void showMessage() {
        System.out.println("Singleton using Enum");
    }
}
