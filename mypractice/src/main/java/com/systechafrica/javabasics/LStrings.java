package com.systechafrica.javabasics;

import java.util.Scanner;

public class LStrings {
    String name = "Emily";
    Scanner s = new Scanner(System.in);
    public void readingStrings() {
        System.out.println("I like when the scanner Listens");
        String message = s.nextLine();
        System.out.println(message);

    }

    public void joiningStrings() {
        System.out.println("Hello my name is: " + name); // String literal and vlue of a string variable
        System.out.println("I live in " + "Kampala ug");

        String start = "My name is";
        String end = "Kamiti nasinza";
        System.out.println(start + " " + end);
    }

    public void writeYourname(){
        System.out.println("Tell me about you: ");
        String message = s.nextLine();
        System.out.println("Your are awesome!");

    }
    public static void main(String[] args) {
        LStrings app = new LStrings();
        //app.readingStrings();
        //app.joiningStrings();
        app.writeYourname();

    }

}