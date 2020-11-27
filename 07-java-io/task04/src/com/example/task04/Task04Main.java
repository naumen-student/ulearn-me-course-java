package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double sum = 0.0;
        while(scan.hasNext()){
            if(scan.hasNextDouble()){
                sum += scan.nextDouble();
            }
            else {
                scan.next();
            }
        }
        System.out.format(Locale.ENGLISH,"%.6f", sum);
    }
}
