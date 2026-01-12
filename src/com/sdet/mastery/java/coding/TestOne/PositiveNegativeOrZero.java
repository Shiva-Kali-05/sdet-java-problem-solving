package com.sdet.mastery.java.coding.TestOne;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        //Write a Java program to check whether a given number is positive, negative, or zero
        // using the ternary operator.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = sc.nextInt();
        String result = (num>0) ?  "Number is Positive" : (num==0) ? "Number is Zero" : "Number is Negative";
        System.out.println(result);

    }
}
