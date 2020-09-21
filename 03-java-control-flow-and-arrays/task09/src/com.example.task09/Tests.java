package com.example.task09;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testMin() {
        Assert.assertEquals("min [0, 0, 0, 0] = 0", 0, Task09Main.min(new int[]{0, 0, 0, 0}));
        Assert.assertEquals("min [1, 1, 1, 1] = 1", 1, Task09Main.min(new int[]{1, 1, 1, 1}));
        Assert.assertEquals("min [1, 2, 3, 4] = 1", 1, Task09Main.min(new int[]{1, 2, 3, 4}));
        Assert.assertEquals("min [5, 4, 3, 2] = 2", 2, Task09Main.min(new int[]{5, 4, 3, 2}));
        Assert.assertEquals("min [5, 4, -7, 2] = -7", -7, Task09Main.min(new int[]{5, 4, -7, 2}));
        Assert.assertEquals("min [2147483647] = 2147483647", 2147483647, Task09Main.min(new int[]{2147483647}));

    }
    
}