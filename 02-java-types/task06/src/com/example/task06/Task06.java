package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int res = 0;
        do {
            res++;
            sum /= 10;
        } while (sum != 0);
        return res;
    }

    public static void main(String[] args) {
    }

}
