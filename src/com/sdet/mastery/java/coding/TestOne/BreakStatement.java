package com.sdet.mastery.java.coding.TestOne;

public class BreakStatement {
    public static void main(String[] args) {
//Write a Java program to print numbers from 1 to 10,
// but stop the loop when the number becomes 5 using the break statement.

        int num = 0;
        for(int i =1;i<=10;i++)
        {
            if(i ==5)
            {
                break;
            }
            System.out.println("The value of i is now : " +i);
        }
    }
}
