package com.example.task06;
import java.util.Arrays;

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
        return Arrays.stream(new int[] {a, b, c, d}).max().getAsInt();
    }

}