package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }

    static int getMax(int a, int b, int c, int d) {
        int result = a;
        if(result < b) result = b;
        if(result < c) result = c;
        if(result < d) result = d;
        return result;
    }

}