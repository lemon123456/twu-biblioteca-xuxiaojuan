package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public String welcomeMessage(){
        return "---------------------WELCOME TO BIBLIOTECA--------------------\n";
    }

    public List<Book> initBookList(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("New WORLD","James","23 5,2009"));
        books.add(new Book("New Sport","Lining","9 23,2002"));
        books.add(new Book("New Music","Zhujing","3 23,2007"));
        books.add(new Book("New Programming","Cuicui","4 25 2008"));
        return books;
    }
}
