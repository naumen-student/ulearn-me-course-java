package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        return String.valueOf(Math.abs(x+y)).length();
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);
    }

}
