package com.learning.Collections;

public class UtopianTree {

    public static int utopianTree(int n) {
        int sum = 0;
        int j= 1;
        if(n == 0){
            return 1;
        }else{
            for(int i=1;i<=n;i++){
                if(i == 1){
                    sum = 2;
                }
                else if(i%2 != 0){
                    sum = sum * 2;
                }else{
                    sum = sum +1;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = UtopianTree.utopianTree(3);
        System.out.println(result);
    }
}
