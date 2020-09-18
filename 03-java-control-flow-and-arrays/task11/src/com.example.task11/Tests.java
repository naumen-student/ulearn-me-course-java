package com.example.task11;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testSwap() {
        int[] arr;

        arr = new int[]{7, 5, 9};
        Task11Main.swap(arr);
        Assert.assertArrayEquals(new int[]{5, 7, 9}, arr);

        arr = new int[]{5, 5, 5};
        Task11Main.swap(arr);
        Assert.assertArrayEquals(new int[]{5, 5, 5}, arr);

        arr = new int[]{9, 11, 7, 8};
        Task11Main.swap(arr);
        Assert.assertArrayEquals(new int[]{7, 11, 9, 8}, arr);

        arr = new int[]{};
        Task11Main.swap(arr);
        Assert.assertArrayEquals("если пришедший массив пуст, то ничего делать не нужно", new int[]{}, arr);

        arr = null;
        Task11Main.swap(arr);
        Assert.assertArrayEquals("если пришедший массив null, то ничего делать не нужно", null, arr);
    }
    
}