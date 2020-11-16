package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int length = (x+"").length();
        for (int number = 0; number < length; number++) {
            if (x % 2 != 0)
                return "FALSE";
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(10);
        System.out.println(result);
    }

}
