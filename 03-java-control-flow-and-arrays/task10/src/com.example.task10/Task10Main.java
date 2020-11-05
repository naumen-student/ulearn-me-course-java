package com.example.task10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        //List<Integer> res = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //return IntStream.range(0, res.size()).reduce((i, j) -> res.get(i) > res.get(j) ? j : i).getAsInt();
        int index = 0;
        int value = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]<=value){
                value = arr[i];
                index = i;
            }
        }
        return index;
    }
}

