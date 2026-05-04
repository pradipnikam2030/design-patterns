package org.DesignPatterns.behavioral.iterator_pattern;


// Build Iterator interface

 interface Iterator {
     boolean hasNext();
     String next();
 }


public class BookIterator implements Iterator{

     String[] books;
     int index = 0;

     BookCollection (String[] books){
         this.books = books;

     }

    @Override
    public boolean hasNext() {
         return index < books.length;
    }

    @Override
    public String next() {
        return books[index++];
    }
}
