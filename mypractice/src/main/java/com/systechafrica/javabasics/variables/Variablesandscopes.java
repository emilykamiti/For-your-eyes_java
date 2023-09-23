package com.systechafrica.javabasics.variables;

public class Variablesandscopes {
    public static void main(String[] args) {
        
    }
    public void eat(int placcesOfCheese){
        int bitesOfCheese = 1;

    }
    public void eatIfHungry(boolean hungry){
        if(hungry){
            int bitesOfCheese =1;
        }
        //?bitesOfCheese goes out of scope here
        //System.out.println(bitesOfCheese);
        System.out.println(hungry);
        {
            boolean teenyBit = true;
            System.out.println(hungry);
        }
    }
}
