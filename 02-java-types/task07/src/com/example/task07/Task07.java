package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        //int x = m*n;
        //int y = k*k;
        int a;
        if(k>n||k>m) return 0;
        else {
            n=n/k;
            m=m/k;
            a = n*m;
            }
        return a;
    }

    public static void main(String[] args) {

        int result = solution(6, 4, 3);
        System.out.println(result);
    }

}
