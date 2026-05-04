package org.DesignPatterns.behavioral.iterator_pattern;

public class Main {
    public static void main(String[] args) {
        String[] books = new String[]{
                "White Nights", "The book thief", "The Alchemist", "Silent Patient", "The rudest book ever"
        };

        Library library = new Library(books);

       Iterator iterator =  library.createIterator();

       int index = 1;
       while (iterator.hasNext()){
           System.out.println("Book "+index ++ +": " + iterator.next());
       }
    }
}
