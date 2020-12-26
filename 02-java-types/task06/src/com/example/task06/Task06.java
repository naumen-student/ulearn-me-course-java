package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = (x + y)/10;
        int n = 1;
        while (sum != 0) {
            sum /= 10;
            n++;
        }
        return n;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}