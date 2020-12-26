package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
    }

    static int numMin(int[] arr) {
        int result = 0, min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= min){
                result = i;
                min = arr[i];
            }
        }
        return result;
    }
}