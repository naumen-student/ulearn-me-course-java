package com.example.task04;

import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double sum = 0;
        while (scanner.hasNext()){
            if (!scanner.hasNextDouble())
                scanner.next();
            else sum += scanner.nextDouble();
        }
        System.out.printf(Locale.ENGLISH, "%.6f%n", sum);
    }
}
