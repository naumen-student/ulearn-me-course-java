package com.example.task03;

import java.io.*;

public class Task03Main{


    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException{
        try (ObjectInputStream stream = new ObjectInputStream(inputStream)) {
            return (SampleData) stream.readObject();
        }
    }
}
