package com.learning.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        try {
            execute();
        } catch (FileNotFoundException e) {
            System.out.println("File is not ready");
            //e.printStackTrace();
        }

    }


    public static void execute() throws FileNotFoundException {

        Scanner contents = new Scanner(new File("asf"));

    }
}
