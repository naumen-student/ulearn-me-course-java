package com.example.task04;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return (float) a / b;
        }
        throw new ValueException("Wrong operation!");
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
