package com.learning.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MarsExploration {

    public static int marsExploration(String s) {
        int chunkSize = 3;

        String[] chunks = s.split("(?<=\\G.{" + chunkSize + "})");

        int value = MarsExploration.findUnCommonCharacters(chunks, "SOS");

        return value;

    }

    public static int findUnCommonCharacters(String[] p, String value){
        String SS[] = value.split("");
        int count = 0;
        for(int i=0;i<p.length;i++){
            String[] d = p[i].split("");

            for(int j=0;j<d.length;j++){
                if(!SS[j].equals(d[j])){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int count = MarsExploration.marsExploration("SOSSOSSOS");
        System.out.println(count);
    }
}
