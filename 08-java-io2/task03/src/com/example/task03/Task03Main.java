package com.example.task03;

import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(deserialize(new FileInputStream("task03/src/main/resources/example1.bin")));
    }

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(inputStream);
        return (SampleData) obj.readObject();
    }
}
