package com.example.task06;

public class Task06 {
    public static int solution(int x, int y) {
        int sum = x + y;
        if (sum == 0)
            return 1;
        int count = 0;
        int integerPart = sum;
        while (integerPart != 0) {
            count++;
            integerPart /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }
}
