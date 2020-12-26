package com.example.task05;
public class Task05 {
    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return "FALSE";
        while (x!=0){
            if (x%2!=0) return "FALSE";
            x/=10;
        }
        return "TRUE";
    }

    public static void main(String[] args)
    {
        String result = solution(1234);
        System.out.println(result);
    }
}

