package com.example.task08;

public class Task08 {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

//        int x = 100;
        float x = Float.POSITIVE_INFINITY;
        return x == x + 1;
    }

    public static void main(String[] args) {

        System.out.println(solution());
    }

}
