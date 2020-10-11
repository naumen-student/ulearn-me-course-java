package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        char[] num = Integer.toString(x).toCharArray();
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 2 != 0)
                return "FALSE";
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
