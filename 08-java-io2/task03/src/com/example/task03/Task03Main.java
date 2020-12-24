package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    }

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream deserializationStream = new ObjectInputStream(inputStream)){
            return (SampleData)deserializationStream.readObject();
        }
    }
}
