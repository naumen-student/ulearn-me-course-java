package com.example.task12;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testSelectionSort() {
        int[] arr;

        arr = new int[]{7, 5, 9};
        Task12Main.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{5, 7, 9}, arr);

        arr = new int[]{5, 5, 5};
        Task12Main.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{5, 5, 5}, arr);

        arr = new int[]{9, 11, 7, 8};
        Task12Main.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{7, 8, 9, 11}, arr);

        arr = new int[]{};
        Task12Main.selectionSort(arr);
        Assert.assertArrayEquals("если пришедший массив пуст, то ничего делать не нужно", new int[]{}, arr);

        arr = null;
        Task12Main.selectionSort(arr);
        Assert.assertArrayEquals("если пришедший массив null, то ничего делать не нужно", null, arr);
    }
    
}