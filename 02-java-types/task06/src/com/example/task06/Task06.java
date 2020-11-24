package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int digitsCount = Integer.toString(x + y).length();
        return x + y >= 0 ? digitsCount : digitsCount - 1;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
