package com.sdet.mastery.java.coding.TestTwo;

public class ex_String_Reverse_UsingLoop {
    public static void main(String[] args) {
        String name ="Automation";
        String reverse="";
        for(int i=name.length()-1;i>=0; i--)
        {
            reverse = reverse+name.charAt(i);

        }
        System.out.println(reverse);
    }
}
