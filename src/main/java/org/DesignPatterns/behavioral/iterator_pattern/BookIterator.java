package org.DesignPatterns.behavioral.iterator_pattern;


// Build Iterator interface

 interface Iterator {
     boolean hasNext();
     String next();
 }

 //Step 2: Concrete Iterator
public class BookIterator implements Iterator{

     String[] books;
     int index = 0;

     BookIterator(String[] books){
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
// Aggregate Interface
interface BookCollection{
     Iterator createIterator();
}