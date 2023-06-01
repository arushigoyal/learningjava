package com.learning.Collections;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistance {

    public static int minimumDistances(List<Integer> a) {
        List<Integer>final1 = new ArrayList<Integer>();

        for(int i=0;i<a.size();i++){
            int duplicateNum = a.get(i);

            for(int j=0;j<a.size();j++){
                if(i!=j && a.get(i) == a.get(j)){
                    final1.add(Math.abs(j-i));
                }
            }
        }

        if(final1.size() > 0){
            int min = final1.get(0);

            for(int k =0;k<final1.size();k++){
                if(final1.get(k) < min){
                    min = final1.get(k);
                }
            }
            return min;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(7);
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(1);
        l1.add(7);
        int result = MinimumDistance.minimumDistances(l1);
        System.out.println(result);
    }
}
