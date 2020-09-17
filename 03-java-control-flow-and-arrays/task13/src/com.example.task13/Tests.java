package com.example.task13;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testSelectionSort() {

        Assert.assertArrayEquals(new int[]{9, 7, 8}, Task13Main.removeMoreThen1000(new int[]{9, 1100, 7, 8}));

        Assert.assertArrayEquals(new int[]{}, Task13Main.removeMoreThen1000(new int[]{}));

        Assert.assertArrayEquals(null, Task13Main.removeMoreThen1000(null));

    }
    
}