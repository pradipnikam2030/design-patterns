package org.DesignPatterns.FactoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        // Email notification
        Notification email = NotificationFactory.getNotification("email");
        email.notifyUser();

        // SMS notification
        Notification sms = NotificationFactory.getNotification("sms");
        sms.notifyUser();
    }
}
