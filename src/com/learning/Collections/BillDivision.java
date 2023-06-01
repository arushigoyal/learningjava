package com.learning.Collections;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for(int i=0;i< bill.size();i++){
            if(k != i){
                sum = sum + bill.get(i);
            }
        }

        int result = sum / 2;
        if(result == b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(Math.abs(result - b));
        }

    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(3);
        l1.add(10);
        l1.add(2);
        l1.add(9);
        BillDivision.bonAppetit(l1, 1, 12);
    }
}
