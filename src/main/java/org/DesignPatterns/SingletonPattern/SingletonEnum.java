package org.DesignPatterns.SingletonPattern;

public enum SingletonEnum {
    INSTANCE;

    public void showMessage() {
        System.out.println("Singleton using Enum");
    }
}
