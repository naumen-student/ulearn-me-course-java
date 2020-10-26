package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int prevByte = System.in.read();
        int currentByte;

        while (prevByte != -1) {
            currentByte = System.in.read();
            if (prevByte != 13 || currentByte != 10) System.out.write(prevByte);
            prevByte = currentByte;
        }
        System.out.flush();
    }
}
