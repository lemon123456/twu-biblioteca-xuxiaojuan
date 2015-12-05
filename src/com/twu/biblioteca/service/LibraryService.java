package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public List<User> initUserList(){
        List<User> users = new ArrayList<User>();
        users.add(new User("xuxiaojuan","xjxu@thoughtworks.com","15109242137","xxj-1234","1234"));
        users.add(new User("duying","ydu@thoughtworks.com","13484532121","duy-1234","123"));
        return users;
    }

    public List<Book> initBookList() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("New WORLD", "James", "23 5,2009"));
        books.add(new Book("New Sport", "Lining", "9 23,2002"));
        books.add(new Book("New Music", "Zhujing", "3 23,2007"));
        books.add(new Book("New Programming", "Cuicui", "4 25 2008"));
        return books;
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
}

