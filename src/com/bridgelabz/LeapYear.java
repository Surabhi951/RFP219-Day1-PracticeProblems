package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.checkLeapYear();
    }

    public void checkLeapYear(){
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year >= 1582) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Please enter greater than or equal to 1582.");
        }
    }
}

