package org.DesignPatterns.FactoryMethodPattern;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("This notification is from Email Service");
    }
}
