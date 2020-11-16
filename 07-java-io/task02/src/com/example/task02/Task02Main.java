package com.example.task02;

import java.io.IOException;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int lastByte = 0;
        while (true) {
            if (lastByte == 13) {
                if ((lastByte = System.in.read()) != 10) {
                    System.out.write(13);
                }
                if (lastByte == -1) {
                    break;
                }
                if (lastByte != 13) {
                    System.out.write(lastByte);
                }
                continue;
            }
            if ((lastByte = System.in.read()) == -1) {
                break;
            }
            if (lastByte != 13) {
                System.out.write(lastByte);
            }
        }
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
    }
}
