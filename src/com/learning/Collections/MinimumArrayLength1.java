package com.learning.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinimumArrayLength1 {

    public int equalizeArray(List<Integer> arr) {


        int intialsize = arr.size();
        // 3 , 3, 2, 1, 3

        // 3
        //    3 , 2 ,1, 3


        //   3
        //     2 ,1 ,3

        int count = 0;

        for (int i = 0; i < arr.size(); i++) {

            boolean duplicate = true;

            for (int j = i+1; j < arr.size(); j++) {

                if(arr.get(i).equals(arr.get(j))){
                    duplicate = false;
                    //break;
                }else{
                    arr.remove(i);
                  //  count ++;
                }

            }
            
        }

        return intialsize - arr.size() ;
    }
    public static void main(String[] args) {
        MinimumArrayLength1 m = new MinimumArrayLength1();
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);
        int getLenght = m.equalizeArray(list);
        System.out.println("Find the lengthe"+ getLenght);

    }
}
