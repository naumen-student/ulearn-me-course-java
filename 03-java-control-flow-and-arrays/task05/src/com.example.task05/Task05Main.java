package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(5,4,3));
    }

    static int getMin(int a, int b, int c) {

        int result;
        return (result = (a > b) ? b : a) <= c ? result : c;
    }
}