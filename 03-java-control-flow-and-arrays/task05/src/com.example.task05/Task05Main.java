package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

    }

    static int getMin(int a, int b, int c) {
        int result = a;
        if(result > b) result = b;
        if(result > c) result = c;
        return result;
    }
}