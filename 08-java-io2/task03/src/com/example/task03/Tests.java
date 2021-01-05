package com.example.task03;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.UUID;

public class Tests {
    @Test
    public void test() throws IOException, ClassNotFoundException {
        for (int i = 0; i < 1000; i++) {
            SampleData data = new SampleData(
                    "" + UUID.randomUUID().toString(),
                    (int) System.currentTimeMillis(),
                    new Date()
            );

            byte[] buffer;
            try (
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ObjectOutputStream oos = new ObjectOutputStream(baos);
            ) {
                oos.writeObject(data);
                buffer = baos.toByteArray();
            }

            try (
                    ByteArrayInputStream bais = new ByteArrayInputStream(buffer)
            ) {
                SampleData result = Task03Main.deserialize(bais);
                Assertions.assertThat(result).isEqualTo(data);
            }
        }
    }
}
