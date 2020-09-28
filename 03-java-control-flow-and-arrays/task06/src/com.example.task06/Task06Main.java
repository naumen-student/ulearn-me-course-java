package com.example.task06;

import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {
        System.out.println(getMax(8, 3, 1, 22));
    }

    static int getMax(int a, int b, int c, int d) {
        int[] numbers = {a, b, c, d};
        Arrays.sort(numbers);
        return numbers[3];
    }

}