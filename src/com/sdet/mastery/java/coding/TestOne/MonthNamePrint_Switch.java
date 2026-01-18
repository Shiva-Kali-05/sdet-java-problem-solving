package com.sdet.mastery.java.coding.TestOne;

import java.util.Scanner;

public class MonthNamePrint_Switch {
    //Write a Java program to print the month name based on the month number (1–12)
    // using a switch statement.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a month name");
        int months =sc.nextInt();
        switch (months){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
        }
    }
}
