package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(deserialize(new FileInputStream("\\src\\main\\resources")));
    }

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        return (SampleData) new ObjectInputStream(inputStream).readObject();
    }
}
