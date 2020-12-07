package com.example.task03;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Tests {
    private void check(byte[] x, String charset, String output) throws IOException {
        try (ByteArrayInputStream in = new ByteArrayInputStream(x)) {
            Assertions.assertThat(Task03Main.readAsString(in, Charset.forName(charset))).as("Input: %s", Arrays.toString(x)).isEqualTo(output);
        }
    }

    @Test
    public void testExample() throws IOException {
        check(new byte[]{48, 49, 50, 51}, "ASCII", "0123");
    }

    @Test
    public void test() throws IOException {
        check(new byte[]{-48, -97, -47, -128, -48, -72, -48, -78, -48, -75, -47, -126}, "UTF8", "Привет");
        check(new byte[]{-3, -14, -18}, "windows-1251", "это");
        check(new byte[]{-44, -59, -45, -44, -39}, "KOI8-R", "тесты");
        check(new byte[]{0, 0, 4, 62, 0, 0, 4, 61, 0, 0, 4, 56}, "UTF-32", "они");
        check(new byte[]{-30, -91, -31, -30, -88, -32, -29, -18, -30}, "IBM866", "тестируют");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws IOException {
        Task03Main.readAsString(null, null);
        Task03Main.readAsString(new ByteArrayInputStream(new byte[0]), null);
        Task03Main.readAsString(null, Charset.defaultCharset());
    }


}
