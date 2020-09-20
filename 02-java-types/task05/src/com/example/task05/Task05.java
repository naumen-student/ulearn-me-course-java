package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        if (x < 0 && 99999 < x)
            return "FALSE";
        while(true) {
            if (x % 2 == 0) {
                x /= 10;
                if (0 < x)
                    continue;
                else
                    return "TRUE";
            }
            else
                return "FALSE";
        }
    }
}
