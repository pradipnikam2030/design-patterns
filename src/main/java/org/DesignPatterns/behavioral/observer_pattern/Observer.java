package org.DesignPatterns.behavioral.observer_pattern;


// Object
interface Observer {
    void update(String news);
}

// Subject
interface NewsChannel{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}


