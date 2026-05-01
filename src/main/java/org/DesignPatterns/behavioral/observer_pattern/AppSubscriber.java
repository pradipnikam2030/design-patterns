package org.DesignPatterns.behavioral.observer_pattern;

public class AppSubscriber implements Observer {
    String name;
    public AppSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " new received on app" + news);
    }
}
