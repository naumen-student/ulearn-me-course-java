package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x != 0)
        {
            if (x%2 == 1)
                return "FALSE";
            x = x/10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(6801);
        System.out.println(result);

    }

}
