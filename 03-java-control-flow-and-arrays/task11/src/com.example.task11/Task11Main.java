package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }

        return index;
    }

    static void swap(int[] arr) {
        if (arr == null){
            return;
        }
        int min_index = numMin(arr);
        if (min_index > 0) {
            int temporary = arr[min_index];
            arr[min_index] = arr[0];
            arr[0] = temporary;
        }
    }

}