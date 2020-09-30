package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        int metr = centimetre/100;

        return metr;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = getMetreFromCentimetre(345);
        System.out.println(result);

    }

}
