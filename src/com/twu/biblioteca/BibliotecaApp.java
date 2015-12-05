package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Library;
import com.twu.biblioteca.service.GetInputHelper;
import com.twu.biblioteca.service.LibraryService;

import java.util.List;

public class BibliotecaApp {

    static BibliotecaApp bibliotecaApp = new BibliotecaApp();
    static LibraryService libraryService = new LibraryService();

    public static void main(String[] args) {

        bibliotecaApp.showWelcomeMessage();
        bibliotecaApp.userLogin();
        bibliotecaApp.userOption();
    }



    public void showWelcomeMessage(){
        System.out.println("--------------------- WELCOME TO BIBLIOTECA --------------------\n");
    }

    public void userLogin(){
        System.out.println("Please enter your library_number: ");
        String libraryNumber = GetInputHelper.getInput();

        System.out.println("Please enter your password: ");
        String password = GetInputHelper.getInput();

        if(libraryService.verifyUserBy(libraryNumber,password)){
            System.out.println("\nLogin Successfully\n");
            bibliotecaApp.showMainMenu();
        }else{
            System.out.println("\nLibrary Number or Password Wrong!\n");
            userLogin();
        }
    }

    public void userOption(){
        int input = -1;
        while(input < 0){
            input = Integer.parseInt(GetInputHelper.getInput());
            switch (input){
                case 0:
                    System.out.println("-------------- Quit --------------\n");
                    break;
                case 1:
                    bibliotecaApp.showBooksOfLibrary();
                    break;
                case 2:
                    System.out.println("checkout");
                    break;
                case 3:
                    System.out.println("return");
                    break;
                default:
                    System.out.println("-------------- Select a valid option ---------------");
            }
        }
    }

    public void showMainMenu(){
        System.out.println( "--------------------- Main Menu --------------------\n" +
                            "[0]Quit \n" +
                            "[1]List Books \n" +
                            "[2]Checkout Book \n" +
                            "[3]Return Book \n\n" +
                            "Please enter your choice:");
    }

    public void showBooksOfLibrary(){
        System.out.println("--------------------- Books Of Library --------------------");
        List<Book> books = libraryService.initBookList();
        System.out.println(libraryService.getBooksOfLibrary(books));
    }

}

