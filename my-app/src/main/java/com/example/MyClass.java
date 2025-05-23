package com.example;

public class MyClass {
    public MyClass() {
        // Empty constructor
    }

    public int add (int a, int b) {
        int c = a +b;
        System.out.println("Add - "+c);
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
