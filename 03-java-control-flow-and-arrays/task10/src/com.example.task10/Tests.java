package com.example.task10;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testMin() {
        Assert.assertEquals("numMin[0, 0, 0, 0] = 3", 3, Task10Main.numMin(new int[]{0, 0, 0, 0}));
        Assert.assertEquals("numMin[1, 1, 1, 1] = 3", 3, Task10Main.numMin(new int[]{1, 1, 1, 1}));
        Assert.assertEquals("numMin[1, 2, 3, 4] = 0", 0, Task10Main.numMin(new int[]{1, 2, 3, 4}));
        Assert.assertEquals("numMin[5, 4, 3, 2] = 3", 3, Task10Main.numMin(new int[]{5, 4, 3, 2}));
        Assert.assertEquals("numMin[5, 4, -7, 2] = 2", 2, Task10Main.numMin(new int[]{5, 4, -7, 2}));
        Assert.assertEquals("numMin[2147483647] = 0", 0, Task10Main.numMin(new int[]{2147483647}));
    }
    
}