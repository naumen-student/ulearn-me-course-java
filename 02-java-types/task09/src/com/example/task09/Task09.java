package com.example.task09;

public class Task09 {

    public static double solution() {
        //Технически я не менял тип переменной, а просто привел его к другому при вычислении выражения
        //Надеюсь так можно было...
        float a = 1.0f;
        float b = 3.0f;
        double x = ((double )a / b - 1.0 / 3.0) * 1.0e9;

        return x;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        /*
        System.out.println(solution());
        */
    }

}
