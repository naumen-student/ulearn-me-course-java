package com.example.task04;

import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args){
        double res =0.0;
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        while(scan.hasNext()){
            if(scan.hasNextDouble()) {
                res += scan.nextDouble();
            }
            else
                scan.next();
        }

        System.out.printf(Locale.ENGLISH, "%.6f", res);
    }
}
