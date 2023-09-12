package com.systechafrica.javabasics;

import java.util.Scanner;

public class LearnscannerMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("My name is Emily, just so you know");
        String message = scan.nextLine();// program memory

        System.out.println(message);
    }
}
