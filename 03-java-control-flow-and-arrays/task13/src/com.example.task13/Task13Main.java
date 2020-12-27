package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {

    }

    static int[] removeMoreThen1000(int[] arr) {
        return  null;
        if (arr == null)
            return null;
        return Arrays.stream(arr).filter(a -> a <= 1000).toArray();
    }

}
