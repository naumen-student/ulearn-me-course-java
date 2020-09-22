package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        return x % 2 != 0 ? "FALSE" :
                x / 10 % 2 != 0 ? "FALSE" :
                        x / 100 % 2 != 0 ? "FALSE" :
                                x / 1000 % 2 != 0 ? "FALSE" :
                                        x / 10000 % 2 != 0 ? "FALSE" : "TRUE";
    }

    public static void main(String[] args) {
    }

}
