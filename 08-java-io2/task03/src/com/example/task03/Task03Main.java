package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(deserialize(new FileInputStream("task03/src/main/resources/example1.bin")));
        */

    }

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        return (SampleData) new ObjectInputStream(inputStream).readObject();
    }
}
