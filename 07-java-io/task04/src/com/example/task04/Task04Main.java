package com.example.task04;

import java.io.IOException;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;
        java.util.Scanner scanner = new java.util.Scanner(System.in).useDelimiter("[\\s\\n]+").useLocale(java.util.Locale.ENGLISH);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
            else
                scanner.next();
        }

        System.out.printf(java.util.Locale.ENGLISH, "%8.6f", sum);
    }
}
