package com.learning.interfaces;

public class CarEngine implements Runnable{

    public void run(){
        System.out.println("Runnable Engine");
    }

    public static void main(String[] args) {
        CarEngine c1 = new CarEngine();
        c1.run();
    }
}
