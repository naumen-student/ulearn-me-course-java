package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        for (char c : String.valueOf(x).toCharArray()) {
            if ((c - '0') % 2 != 0)
                return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
