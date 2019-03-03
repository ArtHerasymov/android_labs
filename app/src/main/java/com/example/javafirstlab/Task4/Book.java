package com.example.javafirstlab.Task4;

public class Book{
    private int id;
    private String author;
    private String name;

    public Book() {}

    public Book(int id, String author, String name){
        this.id = id;
        this.author = author;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return name != null ? name.equals(book.name) : book.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}




/*
        package com.lab4.task2;

public class Main {
    public static void main(String [] args) {
        Catalog catalog = new Catalog();
        catalog.add(new Book(1, "1author", "1name"));
        catalog.add(new Book(2, "2author", "2name"));
        catalog.takeBook("sur1", 0);
        catalog.takeBook("sur1", 1);
        Catalog.Controller.printBooks();
        catalog.returnBook("sur1", catalog.get(0));
        catalog.takeBook("sur2", 1);
        Catalog.Controller.printBooks();
    }
}
*/
