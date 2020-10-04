package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3, 4));
    }

    static int getMax(int a, int b, int c, int d) {
        int num[] = {a,b,c,d};
        int maxVal = num[0];
        for(int i = 0; i < num.length; i++)
        {
            if (num[i] > maxVal) maxVal = num[i];
        }
        return maxVal;
    }

}