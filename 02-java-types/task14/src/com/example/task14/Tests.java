package com.example.task14;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Tests {

    private void check(int input, int output) {
        Assertions.assertThat(Task14.reverse(input)).as("Input: \"%s\"", input).isEqualTo(output);
    }

    @Test
    public void test() throws Exception {
        check(243, 342);
        check(421, 124);
        check(91, 19);
        check(4721, 1274);
        check(123456789, 987654321);
        check(7, 7);
        check(999999, 999999);
    }

}
