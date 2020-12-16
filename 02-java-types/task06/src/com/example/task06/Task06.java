package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int g = 0;
        int z = x + y;
        do {
            g++;
            z /= 10;
        }   while (z != 0);
        return g;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
