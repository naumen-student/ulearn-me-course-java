package com.example.task04;

import java.util.Scanner;
import java.util.Locale;


public class Task04Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double sum = 0.0;
        while (scanner.hasNextDouble())
            sum += scanner.nextDouble();
        System.out.format(Locale.US, "%1.6f", sum);
    }
}
