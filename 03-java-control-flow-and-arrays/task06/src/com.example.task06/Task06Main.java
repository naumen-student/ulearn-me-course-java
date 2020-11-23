package com.example.task06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        int[] array = {a, b, c, d};
        int max = a;
        for (int i: array){
            max = Integer.max(max, i);
        }
        return max;
    }

}