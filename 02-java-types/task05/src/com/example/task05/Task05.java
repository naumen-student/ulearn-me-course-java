package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        for (int i = 0; i < 5; i++) {
            int mod10 = x % 10;
            x/=10;
            if (mod10 % 2 != 0) {
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
