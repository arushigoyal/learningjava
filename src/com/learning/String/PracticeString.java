package com.learning.String;

public class PracticeString {

    public static void main(String[] args) {
        String s1="This is a song";
        String s2="This is a song";
        String s3 = new String("This is a SONg");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
