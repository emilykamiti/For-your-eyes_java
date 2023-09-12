package com.systechafrica.vehicles;

import java.util.Scanner;

public class Vehicles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();

        Bikes b1 = new Bikes();
        Bikes b2 = new Bikes();
        Bikes b3 = new Bikes();
        Bikes b4 = new Bikes();
        Bikes b5 = new Bikes();
        Bikes b6 = new Bikes();


        car1.name = "Benz";
        car2.name = "Lambogini";
        car3.name = "Mitsubishi";
        car4.name = "Ferrari";
        car5.name = "Shevrolet";

        b1.name = "yamaha";
        b2.name = "Suzuki";
        b3.name = "Santa Cruz";
        b4.name = "Canyon";
        b5.name = "Cannondale";
        b6.name = "Specialized";

        car1.cost = "2000$";
        car2.cost = "2500$";
        car3.cost = "3000$";
        car4.cost = "10000$";
        car5.cost = "5000$";

        b1.cost = "400$";
        b2.cost = "200$";
        b3.cost = "500$";
        b4.cost = "700$";
        b5.cost = "300$";
        b6.cost = "1000$";

        System.out.println("Which one is your favorute!");
        System.out.println("1. Bikes: ");
        System.out.println("2. Cars: ");
        int option;
        System.out.println("Enter your option : ");
        option = s.nextInt();

    }
    
}
