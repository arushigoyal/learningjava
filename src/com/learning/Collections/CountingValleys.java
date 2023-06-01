package com.learning.Collections;

public class CountingValleys {


    public static int countingValleys(int steps, String path) {
        String[] result = path.split("");
        int count = 0;
        int valley = 0;
        for (int i=0;i<result.length;i++){
            if(result[i].equals("U")){
                count++;
                if(count == 0){
                    valley++;
                }
            }else if(result[i].equals("D")){
                count--;
            }

        }

        return valley;
    }


    public static void main(String[] args) {
        int result  =CountingValleys.countingValleys(12, "DDUUDDUDUUUD");
        System.out.println(result);

    }
}
