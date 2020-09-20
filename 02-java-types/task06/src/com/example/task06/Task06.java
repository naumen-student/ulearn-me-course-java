package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int number = x + y;
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }
}
