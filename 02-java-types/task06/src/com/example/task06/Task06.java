package com.example.task06;


public class Task06 {

    public static int solution(int x, int y) {

        int z = x + y;
        int a = 0;
        if (z == 0) return 1;

        while (z != 0) {
            z = z / 10;
            a++;
        }

        return a;
    }

    public static void main(String[] args) {

        int result = solution(-1, 1);
        System.out.println(result);

    }

}
