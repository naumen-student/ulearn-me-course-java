package com.example.task01;

import org.junit.Test;

public class Tests {

    @Test(expected = NullPointerException.class)
    public void testCodeWithNPE() {
        Task01Main.codeWithNPE();
    }

}
