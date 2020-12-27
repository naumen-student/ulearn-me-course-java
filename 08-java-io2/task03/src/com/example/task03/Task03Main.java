package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(deserialize(new FileInputStream("08-java-io2/task03/src/main/resources/example1.bin")));
    }

    public static SampleData deserialize(InputStream inputStream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(inputStream)) {
            SampleData result = (SampleData) ois.readObject();
            ois.close();  // без закрытия стрима был не полный балл за решение
            return result; // хотя здесь используется блок try с ресурсами, зачем закрывать stream явно - я немного не понимаю...
        }
    }
}
