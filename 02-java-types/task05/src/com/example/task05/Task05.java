package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        boolean result = String.valueOf(x).matches("[^1+|3+|5+|7+|9+]+");
        return String.valueOf(result).toUpperCase();
    }

    public static void main(String[] args) {
    }

}
