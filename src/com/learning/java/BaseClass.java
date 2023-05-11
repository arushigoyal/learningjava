package com.learning.java;

public class BaseClass extends InheritanceExample{

    String message="This is a sub class";

    public void printMessage(){
        System.out.println(super.message);
        System.out.println(this.message);
    }
}
