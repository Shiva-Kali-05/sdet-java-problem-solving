package com.sdet.mastery.java.coding.TestTwo;

public class ex_String_Palindrome {
    public static void main(String[] args) {
        //Palindrome program
        //Logic - Madam
        String str = "Madam";
        String rev ="";
        for(int i=str.length()-1; i>=0; i--)
        {
            rev = rev+str.charAt(i);

        }
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
