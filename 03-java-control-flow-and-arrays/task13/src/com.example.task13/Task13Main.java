package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null)
            return  null;
        int countElementsLessThen1000 = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 1000){
                countElementsLessThen1000++;
            }
        }
        int[] needArray = new int[countElementsLessThen1000];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 1000){
                needArray[index] = arr[i];
                index++;
            }
        }
        return needArray;
    }

}