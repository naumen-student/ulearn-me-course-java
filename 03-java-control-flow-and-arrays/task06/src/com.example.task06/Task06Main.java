package com.example.task06;
import java.util.Arrays;
import java.util.Collections;
public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
        System.out.println(getMax(0, 0, 7, 7));
    }

    static int getMax(int a, int b, int c, int d) {

        if (a>b && a>c && a>d)
            return a;
        if (b>a && b>c && b>d)
            return b;
        if (c>b && c>a && c>d)
            return c;
        else
            return d;
    }

}
