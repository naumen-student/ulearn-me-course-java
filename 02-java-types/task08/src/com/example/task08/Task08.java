package com.example.task08;

public class Task08 {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

        double x = 1.0;
        while (x!=x+1)
            x*=2;
        return x == x + 1;
    }

    public static void main(String[] args) {

        System.out.println(solution());
    }

}
