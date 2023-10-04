package com.systechafrica.simpleprojects;

import java.util.Scanner;

public class ControlFlow {
    private static int marks;
    private static String grade;

    public static void main(String[] args) {
        ControlFlow cd = new ControlFlow();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Marks: ");
        int marks = scanner.nextInt();

        // control flow
        if (marks >= 90){
            grade = "A";
        }
        else if (marks >= 70 && marks < 90){
            grade = "B";
        }else if (marks >= 65 && marks < 70){
            grade = "C";
        }else if (marks >= 55 && marks < 65){
            grade = "D";
        }else{
            grade = "F";
        }

        System.out.println("Student: " + marks + " " + name + " " + " " + grade);

        scanner.close();

    }

}
