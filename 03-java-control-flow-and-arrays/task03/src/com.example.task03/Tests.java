package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testGetNameOfWeekDays() {
        Assert.assertEquals("1 - понедельник", "понедельник", Task03Main.getNameOfWeekDays(1));
        Assert.assertEquals("2 - вторник", "вторник", Task03Main.getNameOfWeekDays(2));
        Assert.assertEquals("3 - среда", "среда", Task03Main.getNameOfWeekDays(3));
        Assert.assertEquals("4 - четверг", "четверг", Task03Main.getNameOfWeekDays(4));
        Assert.assertEquals("5 - пятница", "пятница", Task03Main.getNameOfWeekDays(5));
        Assert.assertEquals("6 - суббота", "суббота", Task03Main.getNameOfWeekDays(6));
        Assert.assertEquals("7 - воскресенье", "воскресенье", Task03Main.getNameOfWeekDays(7));
    }

}