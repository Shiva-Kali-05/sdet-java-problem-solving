package com.sdet.mastery.java.coding.TestOne;

import java.util.Scanner;

public class IntergerNumbers {
    public static void main(String[] args) {
        //Write a Java program that takes two integer numbers and prints their sum,
        // difference, multiplication, division, and remainder.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

    }
}
