package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        for (char numb_x: Integer.toString(x).toCharArray())
            if ((int) numb_x % 2 != 0)
                return "FALSE";
        return "TRUE";

    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);
    }

}
