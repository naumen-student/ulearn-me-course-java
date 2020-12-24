package com.example.task04;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double res = 0;
        try (Scanner scanner = new Scanner(System.in).useDelimiter(" |\\n")) {
            while (scanner.hasNext()) {
                String value = scanner.next();
                if (tryParseDouble(value)) {
                    res += Double.parseDouble(value);
                }
            }
        }
        System.out.format(Locale.US, "%.6f", res);
    }
    static boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
