package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
    }

    static int getMax(int a, int b, int c, int d) {
        int i = Math.max(Math.max(Math.max(a,b),c),d);
        return i;
    }

}