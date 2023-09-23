package com.systechafrica.exceptionhandling;

public class ExceptionsExample {
  public static void main(String[] args) {
    // System.out.println(" Started ");
    ///checked
    // Thread.sleep(4000); // InterruptedException
    // System.out.println("stopped");

     System.out.println(" Started ");
    //Thread.sleep(4000); // InterruptedException
    int i = 10;
    System.out.println(i/0);
    System.out.println("stopped");
  }  

  
}
