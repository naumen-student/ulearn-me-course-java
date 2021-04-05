package com.example.task05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) {
        String pathToFile = args[0]; // "/home/user/file.txt"
        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        }
        catch (Exception e){
            System.out.println("файл" + pathToFile + "не найден");
        }
    }

    public static String readFile(String pathToFile)  {
        try {
            try {
                FileReader fileReader = new FileReader(pathToFile);
            }
            catch (Exception e){
                System.out.println("файл" + pathToFile + "не найден");
            }
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
        catch (Exception e) {
            System.out.println("произошла ошибка при чтении файла" + pathToFile);
        }
        return null;
    }
}