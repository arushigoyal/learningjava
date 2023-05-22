package com.learning.Collections;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
       // System.out.println("Listing is " + list);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.remove(0);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
