package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sumAbs = Math.abs(x+y);
        return Integer.toString(sumAbs).length();
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
