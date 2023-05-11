/*
* To specify which main method the JVM should execute as the entry point of our application, we use the MANIFEST.MF file. Inside the manifest, we can indicate the main class:

Main-Class: mypackage.ClassWithMainMethod
* */

package com.learning.java;

import java.sql.Array;

public class arrayProgram {

    public static void main(String[] args) {
        int[] abc = new int[]{1,2};
        System.out.println("Array is"+abc[0]);
    }
}
