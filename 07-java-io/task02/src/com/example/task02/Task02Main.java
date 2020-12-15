package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int x = System.in.read();
        while (x > -1) {
            int a = System.in.read();
            if (!(a == 10 && x == 13))
                System.out.write(x);
            x = a;
            System.out.flush();
        }
    }
}
