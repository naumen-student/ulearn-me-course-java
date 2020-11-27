package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        boolean oddNumber = false;
        while (x != 0) {
            int lastNumber = x % 10;
            if (lastNumber % 2 != 0) {
                oddNumber = true;
            }
            x /= 10;
        }
        if (oddNumber)
            return "FALSE";
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
