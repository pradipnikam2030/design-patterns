package org.DesignPatterns.creational.FactoryMethodPattern;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("This notification is from SMS Service");
    }
}
