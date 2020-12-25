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

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        for (int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int k = i + 1; k < arr.length; k++){
                if(arr[k] < arr[min]){
                    min = k;
                }
            }
            int a = arr[i];
            arr[i] = arr[min];
            arr[min] = a;
        }
    }

}