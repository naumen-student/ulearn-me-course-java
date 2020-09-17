package com.example.task07;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    private void check(int n, int m, int k, int output) {
        Assertions.assertThat(Task07.solution(n, m, k)).as("Input: N=%s, M=%s, K=%s", n, m, k).isEqualTo(output);
    }

    @Test
    public void test() throws Exception {
        check(20, 50, 3, 96);
        check(15, 22, 2, 77);
        check(25, 3, 3, 8);
        check(14, 6, 5, 2);
        check(10, 2, 3, 0);
        check(2, 10, 3, 0);
        check(100, 100, 1, 10000);
        check(1000000, 1000000, 50, 400000000);
    }
}
