package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5,4,3));
    }

    static int getMin(int a, int b, int c) {
        int num[] = {a,b,c};
        int minVal = num[0];

        for(int i = 0; i < num.length; i ++)
        {
            if (num[i] < minVal) minVal = num[i];
        }
        return minVal;
    }
}