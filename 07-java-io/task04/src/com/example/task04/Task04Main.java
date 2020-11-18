package com.example.task04;

import java.io.IOException;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        StringBuilder value = new StringBuilder();
        double sum = 0;
        int character;
        while ((character = System.in.read()) != -1) {
            value.append((char) character);
            if (Character.isWhitespace((char) character)) {
                sum = addSum(sum, value);
                value.setLength(0);
            }
        }
        sum = addSum(sum, value);
        System.out.printf(Locale.US, "%.6f", sum);
    }

    static double addSum(double sum, StringBuilder value) {
        try {
            sum += Double.parseDouble(value.toString());
        } catch (NumberFormatException e) {
        }
        return sum;
    }
}