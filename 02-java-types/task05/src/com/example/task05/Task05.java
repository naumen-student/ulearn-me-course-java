package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        while(x % 2 == 0) {
           if (x == 0)
               return "TRUE";
           x = x / 10;

        }


        return "FALSE";
    }

    public static void main(String[] args) {

        String result = solution(5235);
        System.out.println(result);

    }

}
