package org.DesignPatterns.behavioral.iterator_pattern;


// concrete collection
public class Library implements BookCollection{
    String[] books;

    public Library(String[] books){
        this.books = books;
    }
    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
