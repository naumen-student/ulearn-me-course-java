package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String[] substring;
        int odd = 0;
        substring = Integer.toString(x).split("");
        for (String s : substring) {
            if (Integer.parseInt(s) % 2 == 0)
                odd++;
        }
        if (odd == substring.length)
            return "TRUE";
        else
            return "FALSE";
    }
}