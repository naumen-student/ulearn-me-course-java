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

        Scanner inData = new Scanner(System.in)
                .useDelimiter("\\n| ");
        double result = 0;
        while(inData.hasNext()) {
            String e = inData.next();
            try {
                double n = Double.parseDouble(e);
                result += n;
            } catch (NumberFormatException ignore) { }
        }
        System.out.format(Locale.ENGLISH,"%.6f", result).flush();
        inData.close();
    }
}
