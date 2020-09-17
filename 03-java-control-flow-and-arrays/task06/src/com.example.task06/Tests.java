package com.example.task06;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testGetMax() {
        Assert.assertEquals(0, Task06Main.getMax(0, 0, 0, 0));
        Assert.assertEquals(4, Task06Main.getMax(1, 2, 3, 4));
        Assert.assertEquals(5, Task06Main.getMax(5, 4, 3, 2));
        Assert.assertEquals(9, Task06Main.getMax(5, 9, 3, 2));
        Assert.assertEquals(7, Task06Main.getMax(5, 4, 7, 6));
        Assert.assertEquals(Integer.MAX_VALUE, Task06Main.getMax(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        Assert.assertEquals(Integer.MIN_VALUE, Task06Main.getMax(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

}