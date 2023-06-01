package com.learning.Collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayAsList {

    public static void main(String[] args) {

        List<Integer> abc = Arrays.asList(0,1,2,3,4);
        List<Integer> pq = new ArrayList<Integer>();
        pq.add(5);
        System.out.println(abc);
    }
}
