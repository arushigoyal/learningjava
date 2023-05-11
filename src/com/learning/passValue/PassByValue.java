package com.learning.passValue;

public class PassByValue { //Primitives has pass by value concept
    // store variables in differemt location

    int a = 2;
    int b=3;

    public void alterVariable(int a1, int b1){
        a1= 5;
        b1=10;
    }

    public static void main(String[] args) {
        PassByValue p1 = new PassByValue();
        p1.alterVariable(p1.a, p1.b);
        System.out.println("Modified Value of variables" + p1.a + p1.b);
    }
}
