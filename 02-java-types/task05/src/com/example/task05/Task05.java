package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String number = String.valueOf(x);
        int length = number.length();
        while(x % 2 == 0 && length > 1) {
                x /= 10;
                length--;
        }
        if(x % 2 == 0) return "TRUE";
        return "FALSE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
