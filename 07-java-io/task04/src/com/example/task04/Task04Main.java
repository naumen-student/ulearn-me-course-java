package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        double result = 0;
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\s\\n]+").useLocale(Locale.ENGLISH);
        while (scanner.hasNext()) {
            if (!(scanner.hasNextDouble()))
                scanner.next();
            else
                result += scanner.nextDouble();
        }
        System.out.format(Locale.ENGLISH, "%1.6f", result);
    }
}
