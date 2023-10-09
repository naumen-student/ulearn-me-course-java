package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        int sizeOfRes = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 1000) sizeOfRes--;
        }
        int[] resArr = new int[sizeOfRes];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1001) {
                resArr[index] = arr[i];
                index++;
            }
        }
        return resArr;
    }

}