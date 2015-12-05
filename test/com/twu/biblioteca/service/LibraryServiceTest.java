package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
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
    public void getBooksOfLibraryTest(){
        List<Book> books = libraryService.initBookList();
        String bookList = "";
        for (int i=0;i<books.size();i++){
            bookList += "("+(i+1)+")"+books.get(i).getName()+","+books.get(i).getAuthor()+","+books.get(i).getYearPublished()+"\n";
        }
        assertEquals(bookList,libraryService.getBooksOfLibrary(books));
    }

    @Test
    public void verifyUserByTest(){
        assertEquals(true,libraryService.verifyUserBy("xxj-1234","1234"));
        assertEquals(false,libraryService.verifyUserBy("jxx-1234","1234"));
        assertEquals(false, libraryService.verifyUserBy("xxj-1234", "4321"));
        assertEquals(false,libraryService.verifyUserBy("","@#$"));
    }
}
