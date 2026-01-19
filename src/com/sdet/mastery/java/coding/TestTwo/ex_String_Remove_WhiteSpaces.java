package com.sdet.mastery.java.coding.TestTwo;

public class ex_String_Remove_WhiteSpaces {
    public static void main(String[] args) {
        //Remove white spaces from the string
        String str = "Manual and Automation Testing";
        String newstr= str.replace(" ","");
        System.out.println(newstr);
    }
}
