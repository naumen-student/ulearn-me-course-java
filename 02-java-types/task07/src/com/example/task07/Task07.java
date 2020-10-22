package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int correctWidth = m % k;
        int correctLength = n % k;
        m -= correctWidth;
        n -= correctLength;
        long camp = (long)m * n;
        int  tent = k * k;
        return (int)(camp / tent);

    }

    public static void main(String[] args) {

        int result = solution(10, 20, 5);
        System.out.println(result);

    }

}
