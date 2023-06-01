package com.learning.Collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.PreferencesFactory;

public class PdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        String[] result = word.split("");
        List p = new ArrayList();
        int count = 0;
        for(char i='a';i<='z';i++){
            count++;
            for (String str : result) {
                if(str.equalsIgnoreCase(String.valueOf(i))){
                    p.add(count);
                }
            }
        }

        int max = h.get(0);
        for(int j=0;j<h.size();j++){
            for(int k = 0;k<p.size();k++){
                if(p.get(k).equals(j+1)){
                    if(h.get(j) > max){
                        max = h.get(j);
                    }
                }
            }
        }

        return  max * result.length;

    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>(); //1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        l1.add(1);
        l1.add(3);
        l1.add(1);
        l1.add(3);
        l1.add(1);
        l1.add(4);
        l1.add(1);
        l1.add(3);
        l1.add(2);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        int result = PdfViewer.designerPdfViewer(l1, "abc");
        System.out.println(result);


    }
}
