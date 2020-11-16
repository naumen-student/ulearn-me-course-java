package com.example.task09;

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
        int min_v = arr[0];

        for (int i = 1; i< arr.length; i++)
            if (min_v>arr[i])
                min_v = arr[i];

        return min_v;
    }

}