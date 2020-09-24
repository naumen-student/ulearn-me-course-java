package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = Math.abs(x + y);
        if (sum == 0)
            return 1;
        return (int) (Math.log10(sum) + 1);

    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
