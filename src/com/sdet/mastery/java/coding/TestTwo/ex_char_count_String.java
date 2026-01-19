package com.sdet.mastery.java.coding.TestTwo;

public class ex_char_count_String {
    public static void main(String[] args) {
        //Write a Java program to count the total number of characters in a given string (excluding spaces).
        String str = "India is my family";
        int count =0;
        int with_space_count=str.length();
        for(int i =0; i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
        }
        System.out.println("Total char in a given string " +count);
        System.out.println("Total char including space in a string " +with_space_count);
    }
}
