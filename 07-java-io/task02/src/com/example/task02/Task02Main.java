package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int previousByte = System.in.read();

        while (previousByte != -1) {
            int currentByte = System.in.read();
            if (!(currentByte == 10 && previousByte == 13))
                System.out.write(previousByte);
            previousByte = currentByte;
        }
        System.out.flush();
    }
}
