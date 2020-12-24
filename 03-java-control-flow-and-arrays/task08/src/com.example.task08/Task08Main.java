package com.example.task08;
import com.sun.tools.javac.util.StringUtils;
import java.util.Arrays;
import java.util.Collections;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        return arr.length == 0 ? 0 : Arrays.stream(arr).asLongStream().reduce(1, (a,b) -> a*b);
    }

}