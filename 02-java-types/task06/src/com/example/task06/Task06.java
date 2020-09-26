package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int length = Integer.toString(x + y).length();
        if (x + y < 0)
            return length - 1;
        else return length;
    }

    public static void main(String[] args) {

    }

}
