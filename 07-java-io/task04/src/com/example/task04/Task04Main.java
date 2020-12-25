package com.example.task04;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double result = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        while (scanner.hasNext()) {
            if (!(scanner.hasNextDouble()))
                scanner.next();
            else
                result += scanner.nextDouble();
        }
        System.out.format(Locale.ENGLISH, "%1.6f", result);
    }
}
