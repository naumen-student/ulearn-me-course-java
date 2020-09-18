package com.example.task07;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testSum() {
        Assert.assertEquals("сумма массива из 4 нулей = 0", 0, Task07Main.sum(new int[]{0, 0, 0, 0}));
        Assert.assertEquals("сумма массива [1,2,3,4] = 10", 10, Task07Main.sum(new int[]{1, 2, 3, 4}));
        Assert.assertEquals("сумма массива [1,2,3,-7] = -1", -1, Task07Main.sum(new int[]{1, 2, 3, -7}));
        Assert.assertEquals("сумма массива из одного элемента равного 5 = 5", 5, Task07Main.sum(new int[]{5}));
        Assert.assertEquals("сумма пусстого массива = 0", 0, Task07Main.sum(new int[]{}));
        Assert.assertEquals("сумма пусстого массива = 0", 0, Task07Main.sum(new int[0]));
    }

}