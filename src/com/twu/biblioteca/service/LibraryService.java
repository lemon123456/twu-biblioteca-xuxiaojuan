package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public String getWelcomeMessage() {
        return "--------------------- WELCOME TO BIBLIOTECA --------------------\n";
    }

    public String getMainMenu(){
        return "--------------------- WELCOME TO BIBLIOTECA --------------------\n" +
                "[1]List Books \n" +
                "Please enter your choice:";
    }

    public String getBooksOfLibrary(List<Book> books){
        String bookList = "";
        int i = 0;
        for(Book book: books){
            bookList += "("+(i+1)+")"+book.getName()+","+book.getAuthor()+","+book.getYearPublished()+"\n";
            i++;
        }
        return bookList;
    }

    public List<Book> initBookList() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("New WORLD", "James", "23 5,2009"));
        books.add(new Book("New Sport", "Lining", "9 23,2002"));
        books.add(new Book("New Music", "Zhujing", "3 23,2007"));
        books.add(new Book("New Programming", "Cuicui", "4 25 2008"));
        return books;
    }

}
