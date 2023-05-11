package com.learning.overriding;

public class OverridingChildClass extends OverridingExample{

    @Override
    public void printName(int a){
        a= 5;
        System.out.println("This is the child class"+ a);
    }
}
