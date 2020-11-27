package com.example.task02;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    private void check(String input, String output) {
        Assertions.assertThat(Task02.solution(input)).as("Input: \"%s\"", input).isEqualTo(output);

    }

    @Test
    public void testExamples() throws Exception {
        check("5", "byte");
        check("-35000", "int");
        check("512", "short");
        check("2500000000", "long");
    }

    @Test
    public void testByte() throws Exception {
        check("0", "byte");
        check("1", "byte");
        check("100", "byte");
        check("-100", "byte");
        check("" + Byte.MIN_VALUE, "byte");
        check("" + Byte.MAX_VALUE, "byte");
        check("" + Byte.MIN_VALUE / 2, "byte");
        check("" + Byte.MAX_VALUE / 2, "byte");
    }

    @Test
    public void testShort() throws Exception {
        check("130", "short");
        check("-130", "short");
        check("" + Short.MIN_VALUE, "short");
        check("" + Short.MAX_VALUE, "short");
        check("" + Short.MIN_VALUE / 2, "short");
        check("" + Short.MAX_VALUE / 2, "short");
    }

    @Test
    public void testInt() throws Exception {
        check("100000", "int");
        check("-100000", "int");
        check("8000000", "int");
        check("-8000000", "int");
        check("" + Integer.MIN_VALUE, "int");
        check("" + Integer.MAX_VALUE, "int");
        check("" + Integer.MIN_VALUE / 2, "int");
        check("" + Integer.MAX_VALUE / 2, "int");
    }

    @Test
    public void testLong() throws Exception {
        check("4000000000", "long");
        check("-4000000000", "long");
        check("" + Long.MIN_VALUE, "long");
        check("" + Long.MAX_VALUE, "long");
        check("" + Long.MIN_VALUE / 2, "long");
        check("" + Long.MAX_VALUE / 2, "long");
    }

}
