package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String string = Integer.toString(x);
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c % 2 != 1)
                return "TRUE";
        }
        return "FALSE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
