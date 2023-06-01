package com.learning.Collections;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        int count = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<=0){
                count++;
            }
        }

        return count >= k? "NO" : "YES";

    }

    public static void main(String[] args) {
        List<Integer>l1 = new ArrayList<Integer>(); //-58 -29 -35 -18 43 -28 -76 43 -13 6
        l1.add(-58);
        l1.add(-29);
        l1.add(-35);
        l1.add(-18);
        l1.add(43);
        l1.add(-28);
        l1.add(-74);
        l1.add(43);
        l1.add(-13);
        l1.add(6);
        String name = AngryProfessor.angryProfessor(6, l1);
        System.out.println(name);

    }
}
