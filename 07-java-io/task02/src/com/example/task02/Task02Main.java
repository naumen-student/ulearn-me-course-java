package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int currentByte = System.in.read();
        int nextByte = System.in.read();
        while (currentByte != 1) {
            if (currentByte != 13 && nextByte != 10) {
                System.out.write(currentByte);
            }
            currentByte = nextByte;
            System.out.flush();
        }
    }
}
