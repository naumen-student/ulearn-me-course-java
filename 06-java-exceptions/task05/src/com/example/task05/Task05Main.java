package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args){
        String pathToFile = args[0]; // "/home/user/file.txt"
        try {
            String s = readFile(pathToFile);
            System.out.print(s);
        }
        catch (FileNotFoundException e){
            System.out.print("файл \""+ pathToFile + "\" не найден\n");
        }
        catch (IOException e){
            System.out.print("произошла ошибка при чтении файла %s" + pathToFile + "\n");
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