package com.example.task05;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    private void check(int x, String output) {
        Assertions.assertThat(Task05.solution(x)).as("Input: %s", x).isEqualTo(output);
    }

    @Test
    public void testEven() throws Exception {
        check(84226, "TRUE");
        check(462, "TRUE");
        check(2, "TRUE");
        check(88888, "TRUE");
        check(0, "TRUE");
    }

    @Test
    public void testOdd() throws Exception {
        check(17395, "FALSE");
        check(777, "FALSE");
        check(1, "FALSE");
        check(99999, "FALSE");
        check(15, "FALSE");
    }

    @Test
    public void testMixed() throws Exception {
        check(76234, "FALSE");
        check(10, "FALSE");
        check(12345, "FALSE");
        check(99998, "FALSE");
        check(88889, "FALSE");
    }

}
