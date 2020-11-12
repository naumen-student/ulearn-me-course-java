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
        if(arr == null || arr.length == 0) return;
        int temp = arr[0];
        int indexToSwitch = numMin(arr);
        arr[0] = arr[indexToSwitch];
        arr[indexToSwitch] = temp;
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

    static int numMin(int[] arr) {
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