package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        long result = Math.abs(x + y);
        int count = (result == 0) ? 1 : 0;
        while (result != 0) {
            count += 1;
            result /= 10;
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
