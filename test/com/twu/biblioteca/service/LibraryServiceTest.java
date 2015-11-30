package com.twu.biblioteca.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryServiceTest {
    private LibraryService libraryService;

    @Before
    public void initLibraryService()
    {
        libraryService = new LibraryService();
    }

    @Test
    public void showWelcomeMessageTest()
    {
        String welcomeMessage = "-----------------WELCOME TO BIBLIOTECA----------------\n";
        assertEquals(welcomeMessage, libraryService.showWelcomeMessage());
    }


}
