package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int maxOdd = 0;
        while (x > 0) {
            if ((x % 2) > 0) {
                maxOdd = 1;
            }
            x /= 10;
        }
        if (maxOdd > 0) {
            return "FALSE";
        } else {
            return "TRUE";
        }
    }
    public static void main(String[] args) {

        String result = solution(1);
        System.out.println(result);

    }

}
