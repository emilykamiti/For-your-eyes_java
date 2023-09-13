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

        if(option ==1){
            System.out.println("We have five models");
            System.out.println("1. Yamaha");
            System.out.println("2. suzuki");
            System.out.println("3. Santa Cruz");
            System.out.println("4. Canyon");
            System.out.println("5. Cannondale");
            System.out.println("6. Specialized");
        System.out.println("Enter your choice: ");
        
            int n;
            n =s.nextInt();
            if(n == 1){
                System.out.println("The cost of Yamaha:" + b1.cost);
            }

            else if (n==2){
                System.out.println("The cost of suzuki:" + b2.cost);
            }
            else if(n==3){
                System.out.println("The cost of Santa Cruz: " + b3.cost);
            }
            else if (n==4){
                System.out.println("The cost of Canyon: " + b4.cost);
            } 
            else if (n==5){
                System.out.println("The cost of cannodale: " + b5.cost);

            }
            else if (n==6){
                System.out.println("Specialized" + b6.cost);
            }else{
            System.out.println("Please enter a value from 1 to 6: ");
            }
        
        }
        else if (option ==2){
            System.out.println(" we have 5 car five models");
            System.out.println("1. Benz");
            System.out.println("2. Lambogini");
            System.out.println("3. Mitsubishu");
            System.out.println("4. Ferrari");
            System.out.println("5. Shevrolet");
            System.out.println("Enter the car you want");

        }
        int n;
        n = s.nextInt();
        
        if( n == 1){
            System.out.println(" if car is Benz: " + car1.cost);
            System.out.println(" if car is Lambogini: " + car2.cost);
            System.out.println(" if car is Mitsubishi: " + car3.cost);
            System.out.println(" if car is Ferrari: " + car4.cost);
            System.out.println(" if car is Shevrolet: " + car5.cost);
        }
     else{
        System.out.println(" Input number from 1 to 5: ");


    }

}
}
