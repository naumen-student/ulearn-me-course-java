package com.example.task13;

import java.util.Arrays;

public class Task13Main {

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if ( arr == null )
            return null;
        return Arrays.stream(arr)
                .filter(x -> x < 1000)
                .toArray();
    }
}