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

    public void writeYourname() {
        System.out.println("Tell me about you: ");
        String message = s.nextLine(); // wait for input
        System.out.println("Your are awesome!");

    }

    public void enjoyTheStrings(){
        System.out.print("Write your name: ");
        String name = s.nextLine();
        System.out.print("Where do you come from: ");
        String place = s.nextLine();
        System.out.print("How Old are you: ");
        String age = s.nextLine();
        System.out.println("Name: " + name + "Place: " + place + "Age" + age);
        System.out.println("Weldone with the responses, proceed to next level");

    }
    public void complicatedTexts(){
        System.out.println("What is your favorite food:");
        String food = s.nextLine();
        System.out.println("When last did you have your favorite this week?");
        String day = s.nextLine();
        System.out.println("Would you like me to take you for lunch");
        String chance = s.nextLine();

        System.out.println("My favourite food is, " + food);
        System.out.println("I last had my favorite food on " + day);
        System.out.println(chance + "I would love to");


    
    }

    public static void main(String[] args) {
        LStrings app = new LStrings();
        // app.readingStrings();
        // app.joiningStrings();
        // app.writeYourname();
        //app.enjoyTheStrings();
        app.complicatedTexts();

    }

}