package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        arr[0] = 0;
        arr[1] = 0;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return 1;
    }
     if (arr.length == 0)
            return 0;

    long mult = 1;

        for (int a : arr) {
        mult *= a;
    }
        return mult;
}

}