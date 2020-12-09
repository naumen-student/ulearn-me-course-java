package com.example.task01;

import jdk.nashorn.internal.parser.JSONParser;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        codeWithNPE();
         */
    }

    static void codeWithNPE() {

        String str = null;
        System.out.println(str.contains(" "));
    }
}
