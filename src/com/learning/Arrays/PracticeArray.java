package com.learning.Arrays;

import java.sql.Array;
import java.util.Arrays;

public class PracticeArray {

    public static void main(String[] args) {

        int Array[] = new int[10];
        int pq[] = new int[] {1,2,3,4,5, 7, 6};
        Arrays.sort(pq);

        for(int i=0;i<pq.length;i++){
            System.out.println("Array numbers is : " + pq[i]);
        }

        int getElement = Arrays.binarySearch(pq, 4);
        System.out.println("Binary search"+ getElement);
    }
}
