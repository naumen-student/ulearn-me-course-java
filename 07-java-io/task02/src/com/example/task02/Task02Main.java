package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int previous, next = System.in.read();
        while (next != -1) {
            previous = next;
            next = System.in.read();
            if (next == 10 && previous == 13) {
                continue;
            } else {
                System.out.write(previous);
            }
        }
    }
}
