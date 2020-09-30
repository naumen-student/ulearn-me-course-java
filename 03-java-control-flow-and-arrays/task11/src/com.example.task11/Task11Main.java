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
    static int numMin(int[] arr) {
        int number=0;
        int lastvalue=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<=lastvalue){
                number=i;
                lastvalue=arr[i];
            }
        }
        return number;
    }
    static void swap(int[] arr) {
        if(arr==null||arr.length==0)
            return;
        int minNumber=numMin(arr);
        int firstValue=arr[0];
        arr[0]=arr[minNumber];
        arr[minNumber]=firstValue;
    }

}