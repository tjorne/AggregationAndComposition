package Composition;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Book bookObj1 = new Book("Java:A Beginner's Guide", "Herbert Schildt");
        Book bookObj2 = new Book("Core and Advanced Java", " Dreamtech Press");
        Book bookObj3 = new Book("Head First Java", "Kathy Sierra");
        List<Book> books = new ArrayList<Book>();
        books.add(bookObj1);
        books.add(bookObj2);
        books.add(bookObj3);
        Library library = new Library(books);
        List<Book> bks = library.getTotalBooksInLibrary();


        // -------------------------------------------------------------------
        // ------------------ SHOW FOR LOOP VS FOREACH -----------------------
        // -------------------------------------------------------------------

//        for (int i = 0; i < bks.size(); i++)
//        {
//            Book bk = bks.get(i);
//            System.out.println("Title : " + bk.getTitle() + " and "
//                    + " Author : " + bk.getAuthor());
//
//        }

        for (Book bk : bks)
        {
            System.out.println("Title : " + bk.getTitle() + " and "
                    + " Author : " + bk.getAuthor());
        }
    }
}
