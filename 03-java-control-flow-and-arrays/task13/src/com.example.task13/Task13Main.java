package com.example.task13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        return arr == null || arr.length == 0 ? arr
                : Arrays.stream(arr).filter(number -> number < 1000).toArray();
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        for (int i : arr){
//            if (i < 1000)
//                numbers.add(i);
//        }
//        return numbers.stream().mapToInt(e -> e).toArray();
    }

}