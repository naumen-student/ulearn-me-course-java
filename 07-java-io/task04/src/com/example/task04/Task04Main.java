package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in).useLocale(Locale.US);
        double sum = 0;
        while (inputScanner.hasNextDouble())
            sum+= inputScanner.nextDouble();
        inputScanner.close();
        System.out.format(Locale.US,"%.6f", sum);
    }
}
