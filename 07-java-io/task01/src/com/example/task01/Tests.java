package com.example.task01;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Tests {
    private void check(byte[] x, int output) throws IOException {
        try (ByteArrayInputStream in = new ByteArrayInputStream(x)) {
            Assertions.assertThat(Task01Main.checkSumOfStream(in)).as("Input: %s", Arrays.toString(x)).isEqualTo(output);
        }
    }

    @Test
    public void testExample() throws IOException {
        check(new byte[]{0x33, 0x45, 0x01}, 71);
    }

    @Test
    public void testArrays() throws IOException {
        check(new byte[]{1, 2, 3, 4}, 2);
        check(new byte[]{10, 20, 30, 40}, 20);
        check(new byte[]{11, 22, 33, 44}, 110);
        check(new byte[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 3193);
        check(new byte[]{0x52, 0x11, 0x34, 0x7F, 0x0A}, 1420);
        check(new byte[]{42, 35, 52, 62, 46, 34, 37, 2, 41, 5, 41, 4, 15, 3, 78, 36, 36, 3, 79, 37, 34, 67}, 104865115);
        check(new byte[]{0x44}, 68);
        check(new byte[]{0x00}, 0);
        check(new byte[]{}, 0);
    }

    @Test(expected = IOException.class)
    public void testException() throws IOException {
        Task01Main.checkSumOfStream(new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException();
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws IOException {
        Task01Main.checkSumOfStream(null);
    }

}
