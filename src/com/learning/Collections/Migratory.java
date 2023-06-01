package com.learning.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Migratory {

    public int migratoryBirds(List<Integer> arr) {

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.size();i++){

            int count = 0;

            if( ! map.containsKey(arr.get(i))){
                for(int j=0;j<arr.size();j++){
                    if(arr.get(i).equals(arr.get(j))){
                        count++;
                    }
                }
                map.put(arr.get(i),count);
            }

        }

        int defaultValue = 0;
        int finalOutput = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > defaultValue){
                defaultValue = entry.getValue();
                finalOutput= entry.getKey();
            }
        }

        return finalOutput;

    }

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
