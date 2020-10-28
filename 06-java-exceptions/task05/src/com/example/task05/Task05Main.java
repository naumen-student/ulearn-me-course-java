package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) {

        try {
            String pathToFile = args[0];
            String s = readFile(pathToFile);
            System.out.println(s);
        }

        catch (FileNotFoundException e) {
            System.out.println("файл \"" + args[0] + "\" не найден");
        }

        catch (IOException  e) {
            System.out.println("произошла ошибка при чтении файла \"" + args[0] + "\"");
        }
    }

    public static String readFile(String pathToFile) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String currentLine;
        while ((currentLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(currentLine);
            stringBuilder.append("\n");
        }

        bufferedReader.close();
        return stringBuilder.toString();
    }
}