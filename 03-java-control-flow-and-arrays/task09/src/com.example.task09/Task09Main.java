package com.example.task09;
import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
         */
    }

    static int min(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей

        return Arrays.stream(arr).min().getAsInt();
    }

}
