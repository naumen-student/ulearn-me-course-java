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

        double sum = 0.0;
        try (Scanner rer = new Scanner(System.in).useLocale(Locale.UK)) {

            while (rer.hasNextDouble()){
                sum += rer.nextDouble();
            }

        }
        System.out.format(Locale.UK, "%6f", sum);
    }
}
