package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Task05Main {
    public static void main(String[] args){
        String pathToFile = null,s = null;
        try {
            pathToFile = args[0]; // "/home/user/file.txt"
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println(String.format("файл %d не найден", pathToFile));
        }

        try{
            s = readFile(pathToFile);
            throw new IOException();
        }
        catch (IOException exception){
            System.out.println(String.format("произошла ошибка при чтении файла %d", pathToFile));
        }
        System.out.println(s);
    }

    public static String readFile(String pathToFile){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(pathToFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String currentLine = null;
        while (true) {
            try {
                if (!((currentLine = bufferedReader.readLine()) != null)) break;
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            stringBuilder.append(currentLine);
            stringBuilder.append("\n");
        }
        try {
            bufferedReader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return stringBuilder.toString();
    }
}