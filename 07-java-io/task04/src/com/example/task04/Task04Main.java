package com.example.task04;

import java.io.IOException;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int newData = System.in.read();
        while (newData != -1){
            while (newData != ' ' && newData != '\n' && newData != -1){
                stringBuilder.append((char)newData);
                newData = System.in.read();
            }
            try {
                sum += Double.parseDouble(stringBuilder.toString());
            } catch (NumberFormatException e) {
                newData = System.in.read();
                continue;
            }
            stringBuilder = new StringBuilder();
            newData = System.in.read();
        }
        Locale.setDefault(Locale.US);
        System.out.printf("%.6f", sum);
    }
}