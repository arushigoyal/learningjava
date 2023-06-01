package com.learning.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public int sockMerchant(int n, List<Integer>ar){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<ar.size();i++){
            int count = 1;

            if(!map.containsKey(ar.get(i))){

                for(int j=i+1;j<ar.size();j++){
                    if(ar.get(i) == (ar.get(j))){
                        count++;
                    }

                }
                map.put(ar.get(i), count/2);

            }

        }

        int pairofSocks = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            pairofSocks = pairofSocks + entry.getValue();
        }
        return pairofSocks;
    }

    public static void main(String[] args) {
        SalesByMatch socks = new SalesByMatch();
        List<Integer> ar = new ArrayList<>();
        //4 5 5 5 6 6 4 1 4 4 3 6 6 3 6 1 4 5 5 5 ///2+ 3+ 2 + 1 + 1
        ar.add(4);
        ar.add(5);
        ar.add(5);
        ar.add(5);
        ar.add(6);
        ar.add(6);
        ar.add(4);
        ar.add(1);
        ar.add(4);
        ar.add(4);
        ar.add(3);
        ar.add(6);
        ar.add(6);
        ar.add(3);
        ar.add(6);
        ar.add(1);
        ar.add(4);
        ar.add(5);
        ar.add(5);
        ar.add(5);




        int getResult = socks.sockMerchant(ar.size(),ar);
        System.out.println(getResult);
    }
}
