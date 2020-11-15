package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main{
    public static void main(String[] args) throws IOException{
        double sum = 0.0;
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.UK)) {
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
        }
        System.out.format(Locale.UK, "%6f", sum);
    }
}
