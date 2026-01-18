package com.sdet.mastery.java.coding.TestOne;

public class Reverse_String_Do_While {
    //Write a Java program to reverse a given number using a do-while loop.
    public static void main(String[] args) {
        int number =1234;
        int rev=0;
        do{
            int digits = number % 10; //it will get the last digits of number
            rev = rev * 10+digits;  // add digits to rev
            number = number/10; //remove the last digits
        }while(number!=0);
        System.out.println(rev);
    }

}
