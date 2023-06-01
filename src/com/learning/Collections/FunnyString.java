package com.learning.Collections;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {

    public static String funnyString(String s) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> revL1 = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i< s.length();i++){
            char ch = s.charAt(i);
             l1.add((int) ch);
        }
        String reverseS = FunnyString.ReverseString(s);
        for(int i=0;i< reverseS.length();i++){
            char ch = reverseS.charAt(i);
            revL1.add((int) ch);
        }

        for(int j=0;j< l1.size()-1;j++){
            int sub = Math.abs(l1.get(j+1) - l1.get(j));
            int revSub = Math.abs(revL1.get(j+1) - revL1.get(j));
            if(sub == revSub){
                count++;
            }
        }

        if(count ==( l1.size()-1)){
            return "Funny";
        }else{
            return "Not Funny";
        }

    }


    public static String ReverseString(String s){
        char ch;
        String nstr="";
        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }

        return  nstr;
    }

    public static void main(String[] args) {
        String result = FunnyString.funnyString("bcxz");
        System.out.println(result);
    }
}
