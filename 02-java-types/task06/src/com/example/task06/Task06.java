package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        if (x + y >= 0)
            return Integer.toString(x + y).length();
        return Integer.toString(x + y).length() - 1;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
