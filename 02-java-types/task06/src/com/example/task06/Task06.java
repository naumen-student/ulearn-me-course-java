package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        String numbers = String.valueOf(Math.abs(sum));
        return numbers.length();
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
