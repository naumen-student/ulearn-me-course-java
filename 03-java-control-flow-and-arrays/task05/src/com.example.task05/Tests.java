package com.example.task05;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testGetMin() {
        Assert.assertEquals(0, Task05Main.getMin(0, 0, 0));
        Assert.assertEquals(1, Task05Main.getMin(1, 2, 3));
        Assert.assertEquals(3, Task05Main.getMin(5, 4, 3));
        Assert.assertEquals(4, Task05Main.getMin(5, 4, 6));
        Assert.assertEquals(Integer.MAX_VALUE, Task05Main.getMin(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        Assert.assertEquals(Integer.MIN_VALUE, Task05Main.getMin(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

}