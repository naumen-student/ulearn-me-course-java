package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int leftCount = n / k;
        int buttomCount = m / k;
        int result = leftCount * buttomCount;
        
        return result;
    }

    public static void main(String[] args) {

    }

}
