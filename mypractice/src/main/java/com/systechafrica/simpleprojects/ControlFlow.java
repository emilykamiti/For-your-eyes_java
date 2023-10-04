package com.systechafrica.simpleprojects;

import java.util.Scanner;

public class ControlFlow {
    private static String grade;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] name = new String[5];
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student name: " + (i+1)); //! Qn: Why for the String, name[i] prints null when placed where (i+1) is.
            name[i] = scanner.nextLine();

            System.out.println("Enter Marks: " + marks[i]);
            marks[i] = scanner.nextInt();
            scanner.nextLine();

        }
        System.out.println("Student Grading:");
        for (int i = 0; i < 5; i++) {

            if (marks[i] >= 90) {
                grade = "A";
            } else if (marks[i] >= 70 && marks[i] < 90) {
                grade = "B";
            } else if (marks[i] >= 65 && marks[i] < 70) {
                grade = "C";
            } else if (marks[i] >= 55 && marks[i] < 65) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Student: " + marks[i] + " " + name[i] + " " + " " + grade);
        }
        scanner.close();
    }
}
