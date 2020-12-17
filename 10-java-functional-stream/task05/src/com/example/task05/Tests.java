package com.example.task05;

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
        impl = Reflect.compile("com.example.task05.TestsImpl", classContent).create().get();
    }

    @Test
    public void testExample1() {
        impl.testExample();
    }

}
