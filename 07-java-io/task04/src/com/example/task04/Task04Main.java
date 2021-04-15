package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double result = 0;
        Scanner scanner = new Scanner(System.in).useDelimiter(" |\\n");
        while (scanner.hasNext()) {
            String value = scanner.next();
            if (isDouble(value)) {
                result += Double.parseDouble(value);
            }
        }
        System.out.format(Locale.US, "%.6f", result);
    }
    static boolean isDouble(String str){
        try {
            Double.parseDouble(str);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}