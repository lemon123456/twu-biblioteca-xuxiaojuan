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

        libraryService.setBookList();
        bibliotecaApp.showWelcomeMessage();
        bibliotecaApp.userLogin();

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
                    bibliotecaApp.showBooksAvailable();
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
                            "[3]Return Book \n" +
                            "[4]User Information \n\n" +
                            "Please enter your choice:");
        bibliotecaApp.userOption();
    }

    public void showBooksOfLibrary(){
        System.out.println("--------------------- Books Of Library --------------------");
        List<Book> books = libraryService.initBookList();
        System.out.println("Please enter your choice:");
        selectOneBookOption();
    }

    public void selectOneBookOption(){
        int enterNumber = Integer.parseInt(GetInputHelper.getInput());
        int bookSize = libraryService.initBookList().size();
        if (enterNumber == 0){
            showMainMenu();
        }else if(enterNumber > bookSize){
            System.out.println("Select a valid option:");
            selectOneBookOption();
        }else{
            showBookInformationby(enterNumber);
        }
    }

    public void showBookInformationby(int no){
        System.out.println(libraryService.getBookInformationBy(no));
        System.out.println("Enter 0 to Book List:");
        int enterNumber = Integer.parseInt(GetInputHelper.getInput());
        if(enterNumber == 0){
            showBooksOfLibrary();
        }else{
            System.out.println("Select a valid option:");
        }
    }

    public void showBooksAvailable(){
        System.out.println("---------------- Books Available -------------------");
        System.out.println(libraryService.getBooksAvailable());
        System.out.println("Please enter your choice:");
        bibliotecaApp.selectOneBookToBorrow();
    }

    public void selectOneBookToBorrow(){
        int enterNumber = Integer.parseInt(GetInputHelper.getInput());
        if(enterNumber == 0){
            showMainMenu();
        }else if(enterNumber > libraryService.getBooksSize()){
            System.out.println("Select a valid option:");
        }else{
            if(libraryService.setOneBookBorrowed(enterNumber)){
                System.out.println("Thank you! Enjoy the book!");
            }else{
                System.out.println("That book is not available!");
            }
            showBooksAvailable();
        }
    }



}

