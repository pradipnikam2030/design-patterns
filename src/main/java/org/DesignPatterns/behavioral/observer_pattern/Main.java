package org.DesignPatterns.behavioral.observer_pattern;

public class Main {
    public static void main(String[] args) {
        NewsChannelImpl newsChannel = new NewsChannelImpl();

        Observer observer1 = new AppSubscriber("Andrew");
        Observer observer2 = new EmailSubscriber("John");

        newsChannel.addObserver(observer1);
        newsChannel.addObserver(observer2);

        newsChannel.setNews("Breaking news : Java is awesome!");


    }
}
