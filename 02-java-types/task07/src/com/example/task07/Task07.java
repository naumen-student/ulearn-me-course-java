package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int sideN = n / k;
        int sideK = m / k;
        return sideK * sideN;
    }

    public static void main(String[] args) {
    }

}