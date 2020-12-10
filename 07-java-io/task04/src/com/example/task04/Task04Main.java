package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\s\\n]+").useLocale(Locale.ENGLISH);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else scanner.next();
        }
        System.out.printf(Locale.ENGLISH, "%8.6f", sum);
    }
}
