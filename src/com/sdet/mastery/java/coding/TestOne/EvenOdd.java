package com.sdet.mastery.java.coding.TestOne;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Write a Java program to check whether a given number is even or odd using arithmetic operators.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = sc.nextInt();
        if(num % 2==0)
        {
            System.out.println("Entered number is even");
        }
        else
        {
            System.out.println("Entered number is odd");
        }

    }
}
