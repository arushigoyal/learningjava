package com.learning.Collections;

public class PowerSum {

    public static int powerSum(int X, int N) {

        int count = 0;

        for(int i = 1;i<=X;i++){

            if(Math.pow(i,N) == X){
                count++;
            }else{
                for(int j=1;j<=X;j++){
                    if(Math.pow(i,N) + Math.pow(j,N) == X){
                        count++;
                    }
                }
            }
        }


        return count;

    }

    public static void main(String[] args) {

       int result =  PowerSum.powerSum(100, 3);
       System.out.println("result"+result);
    }
}
