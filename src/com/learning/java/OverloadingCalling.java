package com.learning.java;

public class OverloadingCalling {

    public static void main(String[] args) {
        OverloadingExample x = new OverloadingExample();
        System.out.println("Print Sum of 2 numbers"+ x.addition(1,2));
        System.out.println("Print Sum of 3 numbers"+ x.addition(1,2, 3));
    }
}
