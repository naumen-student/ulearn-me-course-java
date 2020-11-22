package com.example.task07;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class Tests {

    @Test
    public void testCountExceptions_unchecked() throws Exception {
        Processor mockedProcessor = Mockito.mock(Processor.class);
        Mockito.when(mockedProcessor.process()).thenThrow(new IllegalArgumentException());

        Task07Main main = new Task07Main();
        main.processor = mockedProcessor;

        String actual = main.getExceptionType();
        Assert.assertEquals(actual, Task07Main.UNCHECKED);
    }

    @Test
    public void testCountExceptions_checked() throws Exception {
        Processor mockedProcessor = Mockito.mock(Processor.class);
        Mockito.when(mockedProcessor.process()).thenThrow(new IOException());

        Task07Main main = new Task07Main();
        main.processor = mockedProcessor;

        String actual = main.getExceptionType();
        Assert.assertEquals(actual, Task07Main.CHECKED);
    }

    @Test
    public void testCountExceptions_none() throws Exception {
        Processor mockedProcessor = Mockito.mock(Processor.class);
        Mockito.when(mockedProcessor.process()).thenReturn("answer");

        Task07Main main = new Task07Main();
        main.processor = mockedProcessor;

        String actual = main.getExceptionType();
        Assert.assertEquals(actual, Task07Main.NONE);
    }

}