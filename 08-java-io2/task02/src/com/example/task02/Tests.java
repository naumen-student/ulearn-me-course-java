package com.example.task02;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Tests {

    @Test
    public void testRoot() throws IOException, InterruptedException {
        List<Path> list = Task02Main.listFiles(Paths.get("src/main/resources/"));

        Assertions.assertThat(list).isNotNull();

        Assertions.assertThat(list).size().isEqualTo(7);

        Assertions.assertThat(list).contains(
                Paths.get("src/main/resources/doc1.txt"),
                Paths.get("src/main/resources/a/doc2.txt"),
                Paths.get("src/main/resources/a/doc3.txt"),
                Paths.get("src/main/resources/a/c/doc4.txt"),
                Paths.get("src/main/resources/d/e/doc5.txt"),
                Paths.get("src/main/resources/d/e/f/doc6.txt"),
                Paths.get("src/main/resources/d/e/f/doc7.txt")
        );
    }

    @Test
    public void testA() throws IOException, InterruptedException {
        List<Path> list = Task02Main.listFiles(Paths.get("src/main/resources/a/"));

        Assertions.assertThat(list).isNotNull();

        Assertions.assertThat(list).size().isEqualTo(3);

        Assertions.assertThat(list).contains(
                Paths.get("src/main/resources/a/doc2.txt"),
                Paths.get("src/main/resources/a/doc3.txt"),
                Paths.get("src/main/resources/a/c/doc4.txt")
        );
    }

    @Test
    public void testE() throws IOException, InterruptedException {
        List<Path> list = Task02Main.listFiles(Paths.get("src/main/resources/d/e/"));

        Assertions.assertThat(list).isNotNull();

        Assertions.assertThat(list).size().isEqualTo(3);

        Assertions.assertThat(list).contains(
                Paths.get("src/main/resources/d/e/doc5.txt"),
                Paths.get("src/main/resources/d/e/f/doc6.txt"),
                Paths.get("src/main/resources/d/e/f/doc7.txt")
        );
    }
}
