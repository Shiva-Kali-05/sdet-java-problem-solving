package com.sdet.mastery.java.coding.TestOne;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        //Write a Java program to perform addition, subtraction, multiplication, or division
        // based on user choice using a switch statement.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1=sc.nextInt();
        System.out.println("Please enter a second number");
        int num2 = sc.nextInt();
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Addition of two numbers :" +(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction of two numbers :" +(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication of two numbers :" + (num1*num2));
                break;
            case 4:
                System.out.println("Addition of two numbers :" +(num1/num2));
                break;
            default:
                System.out.println("Invalid input entered");
        }
       //Scanner.close();
    }

}
