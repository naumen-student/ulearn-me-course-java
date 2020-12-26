package com.example.task01;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Tests {
    private void check(File in, String output) throws IOException, InterruptedException {
        Assertions.assertThat(Task01Main.extractSoundName(in)).as("Input: %s", in.getName()).isEqualTo(output);
    }

    @Test
    public void test3724() throws IOException, InterruptedException {
        check(new File("src/main/resources/3724.mp3"), "Knocking On Door");
    }

    @Test
    public void test3726() throws IOException, InterruptedException {
        check(new File("src/main/resources/3726.mp3"), "Darth Vader Breath");
    }

    @Test
    public void test3727() throws IOException, InterruptedException {
        check(new File("src/main/resources/3727.mp3"), "Evil Laugh");
    }
}
