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

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if  ( arr != null && arr.length != 0){
            int vr = arr[numMin(arr)];
            arr[numMin(arr)] = arr[0];
            arr[0] = vr;
        }
    }
    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min_v = arr[arr.length-1];
        int id = arr.length-1;
        for(int i= arr.length-2;i>=0; i--)
            if (arr[i]<min_v) {
                min_v = arr[i];
                id = i;
            }
        return id;
    }

}