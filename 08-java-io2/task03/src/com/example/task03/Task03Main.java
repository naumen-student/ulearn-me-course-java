package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        @@ -15,7 +16,8 @@ public static void main(String[] args) throws IOException, ClassNotFoundExceptio
    }

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        // your implementation here
        return null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return (SampleData) objectInputStream.readObject();
        }
    }
}