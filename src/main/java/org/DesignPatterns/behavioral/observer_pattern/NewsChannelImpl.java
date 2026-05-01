package org.DesignPatterns.behavioral.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsChannelImpl implements NewsChannel{
    String news;
    List<Observer> observerList = new ArrayList<>();

    public void setNews(String news){
        this.news = news;
        notifyObserver();;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList){
            observer.update(news);
        }
    }
}
