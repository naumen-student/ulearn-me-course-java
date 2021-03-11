package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        if(x % 2 == 0)
        {
            x = x / 10;
            if(x % 2 == 0 ) {
                x = x / 10;
                if(x % 2 == 0) {
                    x = x / 10;
                    if(x % 2 == 0){
                        x = x / 10;
                        if(x % 2 == 0)
                            return "True";
                    }
                }
            }
        }
        return "FALSE";
    }

    public static void main(String[] args) {
    }

}
