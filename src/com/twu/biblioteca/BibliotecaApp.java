package com.twu.biblioteca;

import com.twu.biblioteca.service.LibraryService;

public class BibliotecaApp {

    static BibliotecaApp bibliotecaApp = new BibliotecaApp();
    static LibraryService libraryService = new LibraryService();

    public static void main(String[] args) {
        bibliotecaApp.showWelcomeMessage();
        libraryService.initBookList();
    }

    public void showWelcomeMessage(){
        System.out.println(libraryService.welcomeMessage());
    }

}

