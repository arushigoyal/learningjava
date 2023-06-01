package com.learning.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumArrayLength {

    public int equalizeArray(List<Integer> arr) {

        HashMap <Integer, Integer> map = new HashMap();
        int finalLength = 0;
        for(int i=0;i<arr.size();i++){
            int count =0;

            for(int j=0;j<arr.size();j++){
                if(arr.get(i).equals(arr.get(j))){
                    count++;
                }
            }

                map.put(arr.get(i), count);

        }


        int max = Integer.MIN_VALUE;
        int item = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max) {
                max = entry.getValue();
                item = entry.getKey();
            }
        }


        return arr.size() - max ;


    }
    public static void main(String[] args) {
        MinimumArrayLength m = new MinimumArrayLength();
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        int getLenght = m.equalizeArray(list);
        System.out.println("Find the lengthe"+ getLenght);

    }
}
