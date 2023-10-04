package com.systechafrica.javabasics.variables;

public class MouseVs {
    static int MAX_LENGTH = 5; // class Variable
    int length; // Instance Variable

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches; // newSize only used in if block
            length = newSize;
        }
    }

    public static void main(String[] args) {
        MouseVs mouse = new MouseVs();
    }
}
