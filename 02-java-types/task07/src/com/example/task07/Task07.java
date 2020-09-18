package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int onSideN = n / k;
        int onSideM = m / k;
        int tents = onSideN * onSideM;
        return tents;
    }

    public static void main(String[] args) {

    }

}
