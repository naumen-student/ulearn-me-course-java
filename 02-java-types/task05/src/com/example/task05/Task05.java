package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int num;
        for(int i = 0; i < String.valueOf(x).length() + 1; i++){
            num = x % 10;
            x = x / 10;
            if (num % 2 != 0)
                return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
