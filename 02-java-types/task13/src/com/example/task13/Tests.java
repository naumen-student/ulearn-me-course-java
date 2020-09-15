package com.example.task13;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Tests {


    private void check(char input, char output) {
        Assertions.assertThat(Task13.toUpperCase(input)).as("Input: \"%s\"", input).isEqualTo(output);
    }

    @Test
    public void test() throws Exception {
        check('a', 'A');
        check('q', 'Q');
        check('r', 'R');
        check('g', 'G');
        check('n', 'N');
        check('u', 'U');
    }

}
