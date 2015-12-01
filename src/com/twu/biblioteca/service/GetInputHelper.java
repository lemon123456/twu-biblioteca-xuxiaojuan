package com.twu.biblioteca.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetInputHelper {

    public static String getInput(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
