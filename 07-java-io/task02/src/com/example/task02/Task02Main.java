package com.example.task02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int previousByte = System.in.read();
        int currentByte;
        while(previousByte != -1){
            currentByte = System.in.read();
            if (!(previousByte == 13 && currentByte == 10))
                System.out.write(previousByte);
            previousByte = currentByte;
        }
        System.out.flush();
    }
}
