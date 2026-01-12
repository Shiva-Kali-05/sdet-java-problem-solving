package com.sdet.mastery.java.coding.TestOne;

import java.util.Scanner;

public class NameOfTheDay_Switch {
    public static void main(String[] args) {
        //Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 7");
        int days = sc.nextInt();
        switch (days){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
