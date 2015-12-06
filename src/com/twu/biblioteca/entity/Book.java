package com.twu.biblioteca.entity;

public class Book {

    private String name;
    private String author;
    private String yearPublished;
    private boolean isBorrowed;

    public Book(){

    }

    public Book(String name, String author, String yearPublished, boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}
