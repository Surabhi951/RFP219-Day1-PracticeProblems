package com.bridgelabz;

public class StaticDemo {
    static int a = 50;

    static void display(){
        System.out.println("static method");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println(a);
        display();
    }
}
