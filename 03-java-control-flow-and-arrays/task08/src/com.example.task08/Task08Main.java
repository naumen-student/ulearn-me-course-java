package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
    }

    static long mult(int[] arr) {
        long sum = 1;
        for (long i : arr) {
            sum *= i;
        }
        return arr.length == 0 ? 0 : sum;
    }

}