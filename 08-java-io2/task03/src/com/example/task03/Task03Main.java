package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class Task03Main {

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        // your implementation here
        try (ObjectInputStream stream = new ObjectInputStream(inputStream)) {
            return (SampleData) stream.readObject();
        }
    }
}
