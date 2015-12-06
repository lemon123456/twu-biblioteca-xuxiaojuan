package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public List<User> initUserList(){
        List<User> users = new ArrayList<User>();
        users.add(new User("xuxiaojuan","xjxu@thoughtworks.com","15109242137","xxj-1234","1234"));
        users.add(new User("duying","ydu@thoughtworks.com","13484532121","duy-1234","1234"));
        return users;
    }

    public boolean verifyUserBy(String libraryNumber,String password){
        List<User> users = initUserList();

        for(User user : users){
            if(user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public String getUserInformationBy(String libraryNumber,String password){
        List<User> users = initUserList();

        for(User user : users){
            if(user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)){
                return "User Name: "+user.getUserName()+"\n"+
                        "Email Address: "+user.getEmailAddress()+"\n"+
                        "Phone Number: "+user.getPhoneNumber();
            }
        }
        return "Please update your information.";
    }


    public List<Book> initBookList() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("New WORLD", "James", "23 5,2009", false));
        books.add(new Book("New Sport", "Lining", "9 23,2002", false));
        books.add(new Book("New Music", "Zhujing", "3 23,2007", false));
        books.add(new Book("New Programming", "Cuicui", "4 25 2008", false));
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

