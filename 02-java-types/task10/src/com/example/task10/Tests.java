package com.example.task10;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    private void check(float a, float b, int precision, boolean result) {
        Assertions.assertThat(Task10.compare(a, b, precision)).as("Input: %s == %s (precision %s)", a, b, precision).isEqualTo(result);
    }

    @Test
    public void test() throws Exception {
        check(0.3f + 0.4f, 0.7f, 2, true);
        check(1f, 2f, 1, false);
        check(1f, 2f, 10, false);
        check(1f, 2f, 0, false);
        check(541.162f, 541.162f, 0, true);
        check(541.162f, 541.162f, 1, true);
        check(541.162f, 541.162f, 2, true);
        check(541.162f, 541.162f, 3, true);
        check(541.162f, 541.162f, 4, true);
        check(541.162f, 541.162f, 5, true);
        check(100.001f, 100.009f, 1, true);
        check(100.001f, 100.009f, 2, true);
        check(100.001f, 100.009f, 3, false);
        check(100.001f, 100.009f, 4, false);
    }


    @Test
    public void testInf() throws Exception {
        check(1f / 0f, 1f / 0f, 0, true);
        check(1f / 0f, 1f / 0f, 10, true);
        check(1f / 0f, -1f / 0f, 0, false);
        check(1f / 0f, -1f / 0f, 10, false);
        check(-1f / 0f, -1f / 0f, 0, true);
        check(-1f / 0f, -1f / 0f, 10, true);

        check(1f / 0f, 0f, 10, false);
        check(5f, -1f / 0f, 10, false);
    }

    @Test
    public void testNan() throws Exception {
        check(0.0f / 0.0f, 0.0f / 0.0f, 0, true);
        check(0.0f / 0.0f, 0.0f / 0.0f, 10, true);
        check(0.0f, 0.0f / 0.0f, 10, false);
        check(0.0f / 0.0f, 0.0f, 10, false);
    }
}
