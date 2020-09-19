package com.example.task01;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    @Test
    public void solution() throws Exception {
        String result = Task01.solution();
        Assertions.assertThat(result).isEqualToIgnoringCase("Я думаю, быть программистом - это круто");
    }

}
