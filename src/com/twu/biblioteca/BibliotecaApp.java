package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.service.LibraryService;

import java.util.List;

public class BibliotecaApp {

    static BibliotecaApp bibliotecaApp = new BibliotecaApp();
    static LibraryService libraryService = new LibraryService();

    public static void main(String[] args) {

        bibliotecaApp.showWelcomeMessage();
        bibliotecaApp.showBooksOfLibrary();
    }

    public void showWelcomeMessage(){
        System.out.println(libraryService.getWelcomeMessage());
    }

    public void showBooksOfLibrary(){
        System.out.println("--------------------- Books Of Library --------------------");
        List<Book> books = libraryService.initBookList();
        System.out.println(libraryService.getBooksOfLibrary(books));
    }
}

