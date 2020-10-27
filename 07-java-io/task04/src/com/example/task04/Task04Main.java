package com.example.task04;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double sum = 0.0;
        while (scanner.hasNextDouble()){
            sum += scanner.nextDouble();
        }
        scanner.close();
        System.out.println(String.format(Locale.ENGLISH, "%.6f", sum));
    }
}
