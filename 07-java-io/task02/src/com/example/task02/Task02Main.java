package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int flag = System.in.read();
        int next;
        while (flag > -1) {
            next = System.in.read();
            if (!(flag == 13 && next == 10)){
                System.out.write(flag);
            }
            flag = next;
            System.out.flush();
        }
    }
}

