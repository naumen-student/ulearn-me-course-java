package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    }

    public static SampleData deserialize(InputStream inputStream) {
        try (ObjectInputStream ois = new ObjectInputStream(inputStream)) {
            SampleData sampleData = (SampleData) ois.readObject();
            return sampleData;
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
