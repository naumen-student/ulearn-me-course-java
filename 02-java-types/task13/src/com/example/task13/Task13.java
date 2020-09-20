package com.example.task13;

import sun.nio.cs.UTF_8;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task13 {

    public static char toUpperCase(char c) {
        String str = Character.toString(c);
        str = str.toUpperCase();
        c = str.charAt(0);
        return c;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        char result = toUpperCase('x');
        System.out.println(result);
    }

}
