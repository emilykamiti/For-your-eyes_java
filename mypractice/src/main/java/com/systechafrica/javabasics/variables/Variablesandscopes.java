package com.systechafrica.javabasics.variables;

public class Variablesandscpes {
    public static void main(String[] args) {
        
    }
    public void eat(int placcesOfCheese){
        int bitesOfCheese = 1;

    }
    public void eatIfHungry(boolean hungry){
        eat e = new eat();
        if(hungry){
            int bitesOfCheese =1;
        }
        //bitesOfCheese goes out of scope here
        System.out.println(bitesOfCheese);
        System.out.println(hungry);
    }
}
