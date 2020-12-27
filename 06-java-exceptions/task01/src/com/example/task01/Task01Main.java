package com.example.task01;

import java.lang.reflect.Array;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        codeWithNPE();
         */
    }

    static void codeWithNPE() {
        Integer[] numbers = null;
        System.out.println(numbers[0]);
    }
}
