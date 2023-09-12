package com.systechafrica.javabasics.variables;

import java.util.Scanner;

public class UnderstandingVariables {
    Scanner s = new Scanner(System.in);
    // ?variables are unique, no two varibale can have the same name
    static String text = "Hello";
    static int wholeNumber = 123;
    static double floatingPoint = 3.123456;
    static boolean trueOrfalse = true;

    public void variablesUnique() {
        System.out.println("Hi " + text);
        System.out.println("" + wholeNumber);
        System.out.println("" + floatingPoint);
        System.out.println("" + trueOrfalse);
        System.out.println(text);
    }

    public void namingvariables() {
        // double a = 3.14;
        // double b = 22.0;
        // double c = a*b*a;
        // System.out.println(c);

        // calculate area of a circle and Add to area of a triangle
        double r = 12;
        double pi = 3.145;
        double area1 = r * r * pi;

        int l = 20;
        int w = 70;
        int area2 = l * w;

        double totalArea = area1 + area2;
        System.out.println("Total:   " + totalArea + "cm squared");

    }

    public void readingIntegers() {
        //?Integer.valueof command
        String valueAsString = "42";
        int value1 = Integer.valueOf(valueAsString);
        System.out.println(value1);

        //?you canconvert a String to an int using .ValueOf command.
        System.out.println("write value");
        int value = Integer.valueOf(s.nextLine());
        System.out.println("Value: " + value);

        System.out.println("My age is");
        int age = s.nextInt();
        System.out.println(" I am: " + age);


    }

    public void readingDoubles(){
        //?convert a String to double
        String mydouble = "3.245";
        double val = Double.valueOf(mydouble);
        System.out.println(val);

    }

    public static void main(String[] args) {
        UnderstandingVariables uv = new UnderstandingVariables();
        // uv.variablesUnique();
        //uv.namingvariables();
        //uv.readingIntegers();
        uv.readingDoubles();
    }
}
