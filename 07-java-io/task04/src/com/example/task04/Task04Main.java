package com.example.task04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(reader).useLocale(Locale.US);
        double sum = 0;
        while (scanner.hasNextDouble())
            sum += scanner.nextDouble();
        System.out.printf(Locale.US, "%.6f", sum);
    }
}
