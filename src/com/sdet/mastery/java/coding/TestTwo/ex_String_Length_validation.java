package com.sdet.mastery.java.coding.TestTwo;

public class ex_String_Length_validation {
    public static void main(String[] args) {
        //Write a Java program to check whether the length of a given string is greater than 10 or not
        // and print the result.
        String str = "Nihal is naughty boy";
        int length = str.length();
        if(length>10)
        {
            System.out.println("length is greater than 10");
        }
        else
        {
            System.out.println("length is not a greater than 10");
        }
    }
}
