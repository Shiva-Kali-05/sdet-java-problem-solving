package com.sdet.mastery.basics;

import java.util.Scanner;

public class P_004_Factorial_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int fact = 1;
        if(sc.hasNextInt())//this will check the input is integer or not
        {
            int num = sc.nextInt();
            System.out.println(num);
            for(int i=1;i<=num; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial number is : " +fact);
        }
        else
        {
            System.out.println("Please enter only integer number");
        }
    }
}
