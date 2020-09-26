package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        int[] result = new int[getArrayLengthWithOut1000(arr)];
        int lastUsedIndex = 0;
        for (int i = 0; i < result.length; i++) {
            int[] getNewElementAndLastIndex = getNewElementLowerThen1000(arr, lastUsedIndex);
            result[i] = getNewElementAndLastIndex[0];
            lastUsedIndex = getNewElementAndLastIndex[1];
        }
        return result;
    }

    public static int getArrayLengthWithOut1000(int[] arr) {
        int count = 0;
        for (int element : arr)
            if (element <= 1000)
                count++;
        return count;
    }

    public static int[] getNewElementLowerThen1000(int[] arr, int lastIndex) {
        if (lastIndex == 0)
            return new int[]{arr[0], 1};
        for (int i = lastIndex + 1; i < arr.length; i++) {
            if (arr[i] <= 1000)
                return new int[]{arr[i], i};
        }
        return new int[]{0, 0};
    }
}