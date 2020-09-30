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
    static void HoareSort(int[] array, int start, int end)
    {
        if (end == start) return;
        int pivot = array[end];
        int storeIndex = start;
        for (int i = start; i <= end - 1; i++)
            if (array[i] <= pivot)
            {
                int t = array[i];
                array[i] = array[storeIndex];
                array[storeIndex] = t;
                storeIndex++;
            }

        int n = array[storeIndex];
        array[storeIndex] = array[end];
        array[end] = n;
        if (storeIndex > start) HoareSort(array, start, storeIndex - 1);
        if (storeIndex < end) HoareSort(array, storeIndex + 1, end);
    }

    static void HoareSort(int[] array)
    {
        HoareSort(array, 0, array.length - 1);
    }
    static void selectionSort(int[] arr) {
        if(arr==null||arr.length==0)
            return;
        HoareSort(arr);
    }

}