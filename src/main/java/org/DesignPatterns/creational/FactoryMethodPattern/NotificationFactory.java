package org.DesignPatterns.creational.FactoryMethodPattern;

public class NotificationFactory {

    public static Notification getNotification(String input){
        if (input.equalsIgnoreCase("sms")){
            return new SmsNotification();
        }
        else if (input.equalsIgnoreCase("email")){
            return new EmailNotification();
        }
        else{
            throw new IllegalArgumentException("Unknown vehicle type: " + input);
        }
    }
}
