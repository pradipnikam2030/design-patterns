package org.DesignPatterns.behavioral.observer_pattern;

public class EmailSubscriber implements Observer{
    String name;
    public EmailSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " new received on email "+ news);
    }
}
