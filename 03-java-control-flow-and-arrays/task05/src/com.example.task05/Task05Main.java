package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(11131,1,1));
    }

    static int getMin(int a, int b, int c) {
        int i = Math.min(Math.min(a,b),c);
        return i;
    }
}