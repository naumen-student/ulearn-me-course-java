package com.example.task08;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testMult() {
        Assert.assertEquals("произведение массива из 4 нулей = 0", 0L, Task08Main.mult(new int[]{0, 0, 0, 0}));
        Assert.assertEquals("произведение массива из 4 едениц = 1", 1L, Task08Main.mult(new int[]{1, 1, 1, 1}));
        Assert.assertEquals("1 * 2 * 3 * 4 = 24", 24L, Task08Main.mult(new int[]{1, 2, 3, 4}));
        Assert.assertEquals("1 * 2 * 3 * -7 = -42", -42L, Task08Main.mult(new int[]{1, 2, 3, -7}));
        Assert.assertEquals("произведение массива из одного элемента равного 5 = 5", 5L, Task08Main.mult(new int[]{5}));
        Assert.assertEquals("произведение пустого массива = 0", 0L, Task08Main.mult(new int[]{}));
        Assert.assertEquals("произведение пустого массива = 0", 0L, Task08Main.mult(new int[0]));
        Assert.assertEquals("8_000_000 * 9_000_000 = 72000000000000", 72000000000000L, Task08Main.mult(new int[]{8_000_000, 9_000_000}));
    }

}