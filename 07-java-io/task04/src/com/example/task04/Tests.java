package com.example.task04;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.*;

public class Tests {
    private void check(String input, String output) throws IOException {
        InputStream sin = System.in;
        PrintStream sout = System.out;
        try {
            ByteArrayOutputStream resultStream = new ByteArrayOutputStream();

            System.setIn(new StringBufferInputStream(input));
            System.setOut(new PrintStream(resultStream));

            Task04Main.main(new String[]{});

            String result = new String(resultStream.toByteArray());
            Assertions.assertThat(result.trim()).as("Input: %s", input).isEqualTo(output);

        } finally {
            System.setIn(sin);
            System.setOut(sout);
        }
    }

    @Test
    public void testExample() throws IOException {
        check("1 2 3", "6.000000");
        check("a1 b2 c3", "0.000000");
        check("-1e3\n18 .111 11bbb", "-981.889000");
    }

    @Test
    public void testEmpty() throws IOException {
        check("", "0.000000");
    }
}
