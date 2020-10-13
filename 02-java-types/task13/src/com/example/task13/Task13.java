package com.example.task13;

import org.junit.Assert;

public class Task13 {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру
        if (!Character.isLetter(c)) Assert.fail();
        return Character.toUpperCase(c);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        char result = solution('x');
        System.out.println(result);
         */
    }

}
