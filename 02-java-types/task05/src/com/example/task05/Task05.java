package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String string = Integer.toString(x);
        for(int i=0;i<string.length();i++){
            char c = string.charAt(i);
            if (c == '1')
                return "FALSE";
            if (c == '3')
                return "FALSE";
            if (c == '5')
                return "FALSE";
            if (c == '7')
                return "FALSE";
            if (c == '9')
                return "FALSE";
            else
                return "TRUE";
    }

    public static void main(String[] args) {
    }

}
