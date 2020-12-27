package com.example.task02;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tests {

    @Test
    public void testExample1() {

        Assertions.assertThat(
                Task02Main.cycleGrayCode(2).limit(10)
        ).containsExactlyElementsOf(
                Stream.of(
                        0, 1, 3, 2, 0, 1, 3, 2, 0, 1
                ).collect(Collectors.toList())
        );

    }

    @Test
    public void testExample2() {

        Assertions.assertThat(
                Task02Main.cycleGrayCode(3).limit(10)
        ).containsExactlyElementsOf(
                Stream.of(
                        0, 1, 3, 2, 6, 7, 5, 4, 0, 1
                ).collect(Collectors.toList())
        );

    }

    @Test
    public void test10() {

        Assertions.assertThat(
                Task02Main.cycleGrayCode(10).skip(1000).limit(3)
        ).containsExactlyElementsOf(
                Stream.of(
                        540, 541, 543
                ).collect(Collectors.toList())
        );

    }

    @Test
    public void test12() {

        Assertions.assertThat(
                Task02Main.cycleGrayCode(12).skip(1000000).limit(10)
        ).containsExactlyElementsOf(
                Stream.of(
                        864, 865, 867, 866, 870, 871, 869, 868, 876, 877
                ).collect(Collectors.toList())
        );

    }

    @Test
    public void test16() {

        Assertions.assertThat(
                Task02Main.cycleGrayCode(16).skip(65534).limit(10)
        ).containsExactlyElementsOf(
                Stream.of(
                        32769, 32768, 0, 1, 3, 2, 6, 7, 5, 4
                ).collect(Collectors.toList())
        );

    }

    @Test
    public void testBounds() {

        Assertions.assertThatThrownBy(() ->
                Task02Main.cycleGrayCode(0)
        ).isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() ->
                Task02Main.cycleGrayCode(17)
        ).isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() ->
                Task02Main.cycleGrayCode(2000000000)
        ).isInstanceOf(IllegalArgumentException.class);

    }

}
