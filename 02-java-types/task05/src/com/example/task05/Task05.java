package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String result = "TRUE";
        while (x > 0) {
            int o = x % 10;
            if (o % 2 == 0)
                x = x / 10;
            else {
                result = "FALSE";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }
}
