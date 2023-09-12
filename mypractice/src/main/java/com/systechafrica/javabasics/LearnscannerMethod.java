package com.systechafrica.javabasics;

import java.util.Scanner;

//? user input and output
public class LearnscannerMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("My name is Emily, just so you know");
        String message = scan.nextLine();// program memory

        // nextLine() method takes the input
        System.out.println(message);
        scan.close();
    }
}
