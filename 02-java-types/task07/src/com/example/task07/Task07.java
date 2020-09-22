package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        return (int)(((long)(m - (m % k)) * (long)(n - (n % k))) / (k * k));
    }

    public static void main(String[] args) {
    }

}
