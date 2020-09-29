package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int numMin(int[] arr, int start_index) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = start_index; i < arr.length; i++){
            if(arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }

        return index;
    }

    static void swap(int[] arr, int index) {
        if (arr == null){
            return;
        }
        int min_index = numMin(arr, index);
        if (min_index > 0) {
            int temporary = arr[min_index];
            arr[min_index] = arr[index];
            arr[index] = temporary;
        }
    }

    static void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i);
        }
    }

}