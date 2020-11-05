package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x + y;
        int count = Integer.toString(sum).length();
        if (sum < 0)
        return count - 1;
        return  count;

    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
