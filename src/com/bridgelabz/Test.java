package com.bridgelabz;

public class Test {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bl;
    char ch;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("The default value of byte is: " + test.b);
        System.out.println("The default value of short is: " + test.s);
        System.out.println("The default value of integer is: " + test.i);
        System.out.println("The default value of long is: " + test.l);
        System.out.println("The default value of float is: " + test.f);
        System.out.println("The default value of double is: " + test.d);
        System.out.println("The default value of boolean is: " + test.bl);
        System.out.println("The default value of character is: " + test.ch);
    }
}
