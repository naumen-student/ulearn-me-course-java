package com.example.task04;

import org.assertj.core.util.Files;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;


public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        Reader reader = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(reader).useLocale(Locale.US);
        double sum = 0;
        while (scanner.hasNextDouble())
            sum += scanner.nextDouble();
        System.out.printf(Locale.US, "%.6f", sum);

    }
}
