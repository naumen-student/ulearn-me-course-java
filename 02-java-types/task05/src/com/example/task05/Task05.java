package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int number = x;
        while (number != 0) {
            if ((number % 10) % 2 != 0)
                return "FALSE";
            number = number / 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
      System.out.println(solution(45));
    }

}
