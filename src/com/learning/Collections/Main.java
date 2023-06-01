package com.learning.Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Migratory m= new Migratory();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        int getResult = m.migratoryBirds(list);
        System.out.println("Final Result"+ getResult);
    }
}
