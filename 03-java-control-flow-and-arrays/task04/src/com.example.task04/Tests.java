package com.example.task04;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @Before
    public void setUpSystemOut() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void cleanUpSystemOut() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void testFrom0to10000() {
        Task04Main.from0to10000();
        String actual = out.toString();
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            expected.append(i);
            expected.append(System.lineSeparator());
        }
        Assert.assertEquals(expected.toString(), actual);
    }

}