package com.example.task13;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        //ArrayList list = new ArrayList ();
        //for(int ses: arr){
            //if (ses <= 1000)
            //    list.add(ses);
         //   }
        //int [] result = new int[list.size()];
        //for (int i = 0; i < list.size(); i++)
           // result[i] = (int)list.get(i);
        //return result;
        return Arrays.stream(arr).filter(c -> c <= 1000).toArray();
    }

}