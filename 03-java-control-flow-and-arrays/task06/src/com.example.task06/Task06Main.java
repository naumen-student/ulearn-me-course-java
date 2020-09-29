package com.example.task06;


public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {

        // Не бейте пожайлуста за такое решение, я понимаю что через условия будет быстрее

        int max = Integer.MIN_VALUE;
        for(int current : new int[] {a, b, c, d}) {
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

}