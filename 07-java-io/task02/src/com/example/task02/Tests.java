package com.example.task02;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class Tests {
    private void check(byte[] input, byte[] output) throws IOException {
        InputStream sin = System.in;
        PrintStream sout = System.out;
        try {
            ByteArrayOutputStream resultStream = new ByteArrayOutputStream();

            System.setIn(new ByteArrayInputStream(input));
            System.setOut(new PrintStream(resultStream));

            Task02Main.main(new String[]{});

            byte[] result = resultStream.toByteArray();
            Assertions.assertThat(Arrays.toString(result)).as("Input: %s", Arrays.toString(input)).isEqualTo(Arrays.toString(output));

        } finally {
            System.setIn(sin);
            System.setOut(sout);
        }
    }

    @Test
    public void testExample() throws IOException {
        check(new byte[]{65, 13, 10, 10, 13}, new byte[]{65, 10, 10, 13});
    }

    @Test
    public void testEmpty() throws IOException {
        check(new byte[]{}, new byte[]{});
    }

    @Test
    public void testArrays() throws IOException {
        check(new byte[]{65, 66, 13, 13, 10, 10, 13, 67, 13, 13}, new byte[]{65, 66, 13, 10, 10, 13, 67, 13, 13});
        check(new byte[]{65, 13, 10, 10, 13}, new byte[]{65, 10, 10, 13});
        check(new byte[]{1, 2, 13, 10, 3, 4, 13, 10, 5, 6}, new byte[]{1, 2, 10, 3, 4, 10, 5, 6});
        check(new byte[]{1, 2, 3, 13, 10, 13, 10, 4, 5, 6}, new byte[]{1, 2, 3, 10, 10, 4, 5, 6});
        check(new byte[]{1, 2, 3}, new byte[]{1, 2, 3});
        check(new byte[]{13, 10, 1, 2, 3, 4, 5, 6}, new byte[]{10, 1, 2, 3, 4, 5, 6});
        check(new byte[]{1, 2, 3, 13, 10, 4, 5, 6}, new byte[]{1, 2, 3, 10, 4, 5, 6});
        check(new byte[]{1, 2, 3, 4, 5, 6, 13, 10}, new byte[]{1, 2, 3, 4, 5, 6, 10});
        check(new byte[]{1, 2, 3, 13, 13, 10, 4, 5, 6}, new byte[]{1, 2, 3, 13, 10, 4, 5, 6});
        check(new byte[]{1, 2, 3, 10, 13, 4, 5, 6}, new byte[]{1, 2, 3, 10, 13, 4, 5, 6});
    }
}
