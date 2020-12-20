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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return 0;
    }
    int x = Integer.compare(a, b) == 1 ? a : b;
    int y = Integer.compare(c, d) == 1 ? c : d;
        return Integer.compare(x, y) == 1 ? x : y;

}