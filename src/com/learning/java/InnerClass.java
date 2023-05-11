package com.learning.java;

public class InnerClass {
    int a =4;
    int b=5;

    class InnerInnerClass{
        void msg(){
            System.out.println("print the outer class variables"+ a+ b);
        }
    }

    public static void main(String[] args) {
        InnerClass a1 = new InnerClass();
        InnerClass.InnerInnerClass b1 = a1.new InnerInnerClass();
        b1.msg();
    }
}
