package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int res = 0, min = arr[0], i = 0;
        for(int n : arr){
            i++;
            if(n <= min){
                res = i;
                min = n;
            }
        }
        return res;
    }

}