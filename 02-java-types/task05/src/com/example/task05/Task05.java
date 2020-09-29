package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String result = "TRUE";
        while(x > 0){
            int end = x % 10;
            if(end % 2 == 0)
                x = x / 10;
            else{
                result = "False";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String result = solution(793);
        System.out.println(result);
    }

}
