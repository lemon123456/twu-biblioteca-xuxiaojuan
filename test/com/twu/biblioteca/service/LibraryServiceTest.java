package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.User;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class LibraryServiceTest {

    private LibraryService libraryService;

    @Before
    public void initLibraryService(){
        libraryService = new LibraryService();
    }

    @Test
    public void initUserListTest(){
        List<User> users = libraryService.initUserList();
        assertEquals(2,users.size());
    }

    @Test
    public void verifyUserByTest(){
        assertEquals(true,libraryService.verifyUserBy("xxj-1234","1234"));
        assertEquals(false,libraryService.verifyUserBy("jxx-1234","1234"));
        assertEquals(false, libraryService.verifyUserBy("xxj-1234", "4321"));
        assertEquals(false,libraryService.verifyUserBy("", "@#$"));
    }

    @Test
    public void getUserInformationByTest(){
        String userInformation = "User Name: xuxiaojuan" + "\n" +
                          "Email Address: xjxu@thoughtworks.com" + "\n" +
                          "Phone Number: 15109242137";
        assertEquals(userInformation,libraryService.getUserInformationBy("xxj-1234","1234"));
        String notification = "Please update your information.";
        assertEquals(notification,libraryService.getUserInformationBy("xxj-1234","4321"));
    }

    @Test
    public void initBookListTest(){
        List<Book> books = libraryService.initBookList();
        assertEquals(4,books.size());
    }

    @Test
    public void getBooksOfLibraryTest(){
        List<Book> books = libraryService.initBookList();
        String bookList = "";
        for (int i=0;i<books.size();i++){
            bookList += "("+(i+1)+")"+books.get(i).getName()+","+books.get(i).getAuthor()+","+books.get(i).getYearPublished()+"\n";
        }
        assertEquals(bookList,libraryService.getBooksOfLibrary(books));
    }
}
