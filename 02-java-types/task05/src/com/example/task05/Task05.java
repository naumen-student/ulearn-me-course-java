package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        if (x == 0)
            return "TRUE";
        if ((x%10)%2 != 0)
            return "FALSE";
        else
            return solution(x/10);
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
