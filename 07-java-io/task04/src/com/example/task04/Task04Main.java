package com.example.task04;

import java.io.IOException;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double result = 0;
        try (Scanner scanner = new Scanner(System.in).useDelimiter(" |\\n")) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result += scanner.nextDouble();
                }
                else
                    scanner.next();
            }
        }
        System.out.format(Locale.US, "%.6f", result);
    }
}
