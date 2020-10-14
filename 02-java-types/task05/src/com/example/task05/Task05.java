package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        int count = (x == 0) ? 1 : 0;
        while (x != 0) {
            if (x % 2 != 0) return "FALSE";
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
    }

}
