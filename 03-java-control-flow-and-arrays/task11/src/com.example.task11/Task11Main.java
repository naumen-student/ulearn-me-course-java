package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {5, 5, 5};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if(arr == null || arr.length == 0)
            return;
        int minValue = Integer.MAX_VALUE;
        int indexMinValue = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] <= minValue){
                minValue = arr[i];
                indexMinValue = i;
            }
        int valueOnZeroIndex = arr[0];
        arr[0] = minValue;
        arr[indexMinValue] = valueOnZeroIndex;
    }

}