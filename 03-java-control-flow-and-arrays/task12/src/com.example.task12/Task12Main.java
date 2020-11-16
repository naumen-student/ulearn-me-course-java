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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if  ( arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++)
                swap(arr, i);
        }
    }
    static void swap(int[] arr, int swi) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if  ( arr != null && arr.length != 0){
            int vr = arr[numMin(arr,swi)];
            arr[numMin(arr,swi)] = arr[swi];
            arr[swi] = vr;
        }
    }
    static int numMin(int[] arr,int ert) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min_v = arr[ert];
        int id = ert;
        for(int i= ert;i < arr.length; i++)
            if (arr[i]<min_v) {
                min_v = arr[i];
                id = i;
            }
        return id;
    }



}