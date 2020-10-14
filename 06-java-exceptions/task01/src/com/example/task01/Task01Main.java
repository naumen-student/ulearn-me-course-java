package com.example.task01;

public class Task01Main {

    public static void main(String[] args) {
        codeWithNPE();
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        codeWithNPE();
         */
    }

    static void codeWithNPE() {
        throw new NullPointerException();
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}