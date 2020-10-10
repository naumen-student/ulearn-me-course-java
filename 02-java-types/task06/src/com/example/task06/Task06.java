package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        String numbers = Integer.toString(sum);
        if (sum < 0)
            return numbers.length() - 1;
        return numbers.length();
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
