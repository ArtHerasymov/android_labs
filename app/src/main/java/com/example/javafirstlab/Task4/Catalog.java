package com.example.javafirstlab.Task4;
import java.lang.reflect.Array;
import java.util.*;

public class Catalog {
    private ArrayList<Book> books = new ArrayList<Book>();
    public Catalog() {}
    public Catalog(ArrayList<Book> books) {
        this.books = books;
    }

    public void add(Book b) {
        books.add(b);
    }
    Book get(int index){
        return books.get(index);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }
    void takeBook(String surname, int index){
        BookController bc = new BookController(surname, books.get(index));
        bc.setGetDate(new Date());
        Controller.add(bc);
    }

    void returnBook(String surname, Book b){
        if(Controller.returnBook(new BookController(surname, b))) System.out.println("Book returned");
        else System.out.println("No such book in controller");
    }

    public static class Controller {
        static ArrayList<BookController> books = new ArrayList<BookController>();
        static void add(BookController b) { books.add(b); }
        public static ArrayList<BookController> getBookControllers(){
            return books;
        }
        static boolean returnBook(BookController b){
            for (BookController bc: books) {
                if(bc.getPersonName().equals(b.getPersonName()) && bc.getBook() == b.getBook()){
                    bc.setReturnedDate(new Date());
                    return true;
                }
            }
            return false;
        }
    }
}




