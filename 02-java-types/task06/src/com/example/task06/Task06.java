package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        if(sum == 0) return 1;
        int counter = 0;
        for (;;counter++)
        {
            if(sum == 0) break;
            else sum = sum /10;
        }
        return counter;
    }

    public static void main(String[] args) {
    }

}
