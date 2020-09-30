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

    private static int countLessThen1000(int[] arr){
        int count = 0;

        for (int number: arr) {
            if (number <= 1000) {
                count++;
            }
        }

        return count;
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return arr;
        }

        int length = countLessThen1000(arr);
        int[] result = new int[length];
        int index = 0;

        for (int number: arr) {
            if (number <= 1000) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

}