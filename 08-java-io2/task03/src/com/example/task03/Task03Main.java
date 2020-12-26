package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    }

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        SampleData result;
        try (ObjectInputStream ois = new ObjectInputStream(inputStream)) {
            result = (SampleData) ois.readObject();
            return result;
        }
    }
}

