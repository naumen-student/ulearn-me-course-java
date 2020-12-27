package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    // public static void main(String[] args) throws IOException {
    // чтобы протестировать свое решение, вам нужно:
    // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
    // - запустить программу
    // - проверить, что получилось 351.731900

    //   System.out.println("0.0");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble())
                sum += scanner.nextDouble();
            else {
                scanner.next();
            }
        }
        System.out.format(Locale.CANADA," %1.6f", sum);
    }
}