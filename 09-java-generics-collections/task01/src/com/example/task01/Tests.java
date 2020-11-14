package com.example.task01;

import org.joor.Reflect;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tests {

    static ITests impl;

    @BeforeClass
    public static void before() throws URISyntaxException, IOException {
        String classContent = new String(Files.readAllBytes(Paths.get(Tests.class.getResource("/TestsImpl.java").toURI())));
        impl = Reflect.compile("com.example.task01.TestsImpl", classContent).create().get();
    }

    @Test
    public void testNonEmpty() {
        impl.testNonEmpty();
    }

    @Test
    public void testIfPresent() {
        impl.testIfPresent();
    }

    @Test
    public void testEmpty() {
        impl.testEmpty();
    }

    @Test
    public void testHalfEmpty() {
        impl.testHalfEmpty();
    }

    @Test
    public void testEquals() {
        impl.testEquals();
    }

}
