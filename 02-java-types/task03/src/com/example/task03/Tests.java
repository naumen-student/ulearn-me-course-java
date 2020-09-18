package com.example.task03;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    private void check(int input, int output) {
        Assertions.assertThat(Task03.getMetreFromCentimetre(input)).as("Input: \"%s\"", input).isEqualTo(output);
    }

    @Test
    public void testExamples() throws Exception {
        check(243, 2);
        check(421, 4);
        check(91, 0);
        check(4721, 47);
        check(999999, 9999);
    }

}
