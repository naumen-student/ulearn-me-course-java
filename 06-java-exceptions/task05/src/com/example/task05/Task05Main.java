package com.example.task05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) throws IOException {
        String pathToFile = args[0]; // "/home/user/file.txt"

        String s = readFile(pathToFile);
        System.out.println(s);
    }

    public static String readFile(String pathToFile) throws IOException {
        try {
            FileReader fileReader = new FileReader(pathToFile);
        }catch (Exception e) {
            System.out.println("файл " + pathToFile +" не найден");
        }
        try {

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
        }catch (Exception e2){
            System.out.println("произошла ошибка при чтении файла " + pathToFile);
        }
        return null;


    }
}