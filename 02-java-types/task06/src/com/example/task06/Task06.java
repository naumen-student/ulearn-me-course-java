package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int summ = x+y;
        String stringFromInt = Integer.toString(summ);
        if(summ<0)
            return stringFromInt.length()-1;
        else
            return stringFromInt.length();
    }

    public static void main(String[] args) {

    }

}
