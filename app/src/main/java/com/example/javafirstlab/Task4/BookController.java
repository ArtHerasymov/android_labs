package com.example.javafirstlab.Task4;

import java.util.Date;

public class BookController{
    private String personName;
    private Book book;
    private Date getDate;
    private Date returnedDate;

    BookController(String personName, Book book){
        this.personName = personName;
        this.book = book;
        getDate = null;
        returnedDate = null;
    }

    String getPersonName() {
        return personName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getGetDate() {
        return getDate;
    }

    void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookController that = (BookController) o;

        if (personName != null ? !personName.equals(that.personName) : that.personName != null) return false;
        if (book != null ? !book.equals(that.book) : that.book != null) return false;
        if (getDate != null ? !getDate.equals(that.getDate) : that.getDate != null) return false;
        return returnedDate != null ? returnedDate.equals(that.returnedDate) : that.returnedDate == null;
    }

    @Override
    public int hashCode() {
        int result = personName != null ? personName.hashCode() : 0;
        result = 31 * result + (book != null ? book.hashCode() : 0);
        result = 31 * result + (getDate != null ? getDate.hashCode() : 0);
        result = 31 * result + (returnedDate != null ? returnedDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookController{" +
                "personName='" + personName + '\'' +
                ", book=" + book +
                ", getDate=" + getDate +
                ", returnedDate=" + returnedDate +
                "}\n";
    }
}
