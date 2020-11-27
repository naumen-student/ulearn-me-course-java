package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while(x!= 0){
            int number = x%10;
            if(number % 2 != 0)
                return "FALSE";
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
        result = solution(2222);
        System.out.println(result);
    }

}
