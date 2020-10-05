package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.print(getMin(7,1,2));
    }

    static int getMin(int a, int b, int c) {
        if(b < a)
            a = b;
        if(c < a)
            a = c;
        return a;
    }
}