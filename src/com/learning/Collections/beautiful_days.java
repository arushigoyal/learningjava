package com.learning.Collections;

public class beautiful_days {

    public static  int beautifulDays(int sd, int ed, int div) { // 20 23 6



        int count = 0;

        while(sd != ed+1){

            int getNum = beautiful_days.ReverseMethodImpl(sd);

            int num = (sd-getNum);

            float divisorValue =  (float) num / div;

           // double divisorValue = num/div;

            if(Math.floor(divisorValue) == divisorValue){
                count++;
            }
            sd++;
        }
        return count;

    }

    public static int ReverseMethodImpl(int sd){
        int num = sd;
        int sum = 0;
        while(num != 0){
            sum = sum *10 + num%10;
            num = (int) Math.floor(num/10);
        }
        return  sum;
    }


    public static void main(String[] args) {
        int result = beautiful_days.beautifulDays(13,45,3);
        System.out.println(result);
    }

}
