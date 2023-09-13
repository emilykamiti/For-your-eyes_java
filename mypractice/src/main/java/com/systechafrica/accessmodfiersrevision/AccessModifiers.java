package com.systechafrica.accessmodfiersrevision;

//?Private: accesssed with in a class

class A {
    // private int i = 10;

    // private void methodOne()
    // {
    // System.out.println(i);
    int i = 10;

    void methodOne() {
        System.out.println(i);

    }

}

public class AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
        // obj.i = 1; // cannot access since its private
        // obj.methodOne();// can accesss since its private

        obj.i = 1;
        obj.methodOne();

    }
}
