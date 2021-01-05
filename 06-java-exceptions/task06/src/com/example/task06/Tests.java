package com.example.task06;

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
    public void testPrintMethodName() {
        new Task06Main().printMethodName();
        String actual = out.toString();
        actual = actual.replaceAll("\n", "");
        Assert.assertEquals("testPrintMethodName", actual);
    }

}