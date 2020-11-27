package com.example.task04;

import com.sun.tools.jdeprscan.scan.Scan;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0;
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        while (scan.hasNext()) {
            if (scan.hasNextDouble())
                sum += scan.nextDouble();
            else
                scan.next();
        }
        System.out.format(Locale.ENGLISH, "%.6f", sum);
    }
}
