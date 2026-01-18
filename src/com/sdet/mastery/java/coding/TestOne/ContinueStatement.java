package com.sdet.mastery.java.coding.TestOne;

public class ContinueStatement {
    public static void main(String[] args) {
        //Write a Java program to print numbers from 1 to 10,
        // but skip printing the number 5 using the continue statement.
        int num = 0;
        for(int i =0; i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println("Value of i " +i);
        }
    }
}
