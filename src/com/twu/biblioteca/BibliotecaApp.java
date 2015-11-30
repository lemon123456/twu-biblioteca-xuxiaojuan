package com.twu.biblioteca;

import com.twu.biblioteca.service.LibraryService;

public class BibliotecaApp {

    static BibliotecaApp bibliotecaApp = new BibliotecaApp();
    LibraryService libraryService = new LibraryService();

    public static void main(String[] args) {
        bibliotecaApp.showWelcomeMessage();
    }

    public void showWelcomeMessage(){
        System.out.println(libraryService.welcomeMessage());
    }

}

