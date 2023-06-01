package com.learning.Collections;

public class Hackerrank {

    public static String hackerrankInString(String s) {
        String ans = "hackerrank";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ans.charAt(j)){
                j++;
                if(j == ans.length()){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String result = Hackerrank.hackerrankInString("hhaacckkekraraannk");
        System.out.println(result);
    }
}
