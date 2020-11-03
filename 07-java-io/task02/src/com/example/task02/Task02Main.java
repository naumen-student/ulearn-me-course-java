package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        byte[] inBytes = System.in.readAllBytes();
        for (int i = 0; i < inBytes.length; i++) {
            if (i != inBytes.length - 1 && inBytes[i] == 13 && inBytes[i + 1] == 10) {
                System.out.write(10);
                i++;
            }
            else System.out.write(inBytes[i]);
        }
    }
}
