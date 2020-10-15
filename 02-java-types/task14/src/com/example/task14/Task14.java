package com.example.task14;

import java.io.Console;

public class Task14 {


    public static int reverse(int value) {

        String out = new StringBuilder(String.valueOf(value)).reverse().toString();
        return Integer.parseInt(out);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
