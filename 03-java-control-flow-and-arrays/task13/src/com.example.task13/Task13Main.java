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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null)
            return null;
        int len = 0;
        for (int i : arr){
            if (i < 1001)
                len += 1;
        }
        int[] newArr = new int[len];
        for (int j : arr) {
            if (j < 1001) {
                newArr[newArr.length - len] = j;
                len--;
            }
        }
        return newArr;
    }

}