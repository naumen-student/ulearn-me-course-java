package com.example.task08;

public class Task08 {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

        double x=2.0;
        while (x!=x+1){
            x = x*2.0;
        }
        //x = x*(2^53);

        return x == x + 1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение

        System.out.println(solution());

    }

}
