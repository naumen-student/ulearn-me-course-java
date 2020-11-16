package com.example.task04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double sum = 0;
        while (sc.hasNext()){
            if(sc.hasNextDouble()){
                sum += sc.nextDouble();
            }
            else sc.next();
        }
        System.out.format(Locale.ENGLISH, "%.6f", sum);
    }
}
