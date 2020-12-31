package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3, 4));
    }

    static int getMax(int a, int b, int c, int d) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (a > b && a > c && a > d)
            return a;
        else if (b > a && b > c && b > d)
            return b;
        else if (c > a && c > b && c > d)
            return c;
        else return d;
    }

}