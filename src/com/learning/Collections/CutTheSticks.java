package com.learning.Collections;

import java.io.Console;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;

public class CutTheSticks {
    List finalList = new ArrayList();
    public List<Integer> cutTheSticksC(List<Integer> arr) {
        int min = arr.get(0);

        finalList.add(arr.size());
        // loop to find minimum from ArrayList
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        if(arr.size() != 1){ //8 8 14 10 3 5 14 12
            this.newModifiedArray(min,arr);
        }
        return finalList;
    }

    public void newModifiedArray(int minValue, List<Integer> arr){
        List l1 = new ArrayList();
        for(int i=0;i<arr.size();i++){
            int newValue =  arr.get(i)-minValue;
            if(newValue != 0){
                l1.add(newValue);
            }

        }
        if(l1.size() != 0){
            this.cutTheSticksC(l1);
        }

    }


    public static void main(String[] args) {
        Console x = System.console();
        if(x != null){
            x.printf("Abc");
        }

        CutTheSticks c1 = new CutTheSticks();
            List<Integer> l1 = new ArrayList<Integer>();

            l1.add(8);
            l1.add(8);
            l1.add(14);
            l1.add(10);
            l1.add(3);
            l1.add(5);
            l1.add(14);
            l1.add(12);


        List getFinalList =  c1.cutTheSticksC(l1);
        System.out.println(getFinalList);

        System.out.print("Have a good");
        System.out.print(" one!");
    }
}
