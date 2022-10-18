package com.bridgelabz;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

    }

}

