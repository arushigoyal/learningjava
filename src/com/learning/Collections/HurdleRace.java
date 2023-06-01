package com.learning.Collections;

import java.util.ArrayList;
import java.util.List;

public class HurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        //[1, 6, 3, 5, 2]
        int max = height.get(0);

        for(int i= 0;i<height.size();i++){
            if(height.get(i) > max){
                max = height.get(i);
            }
        }

        if(k>max){
            return 0;
        }else{
            return max-k;
        }

    }

    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(1);
        l1.add(6);
        l1.add(3);
        l1.add(5);
        l1.add(2);
        int result = HurdleRace.hurdleRace(4,l1);
        System.out.println(result);
    }
}
