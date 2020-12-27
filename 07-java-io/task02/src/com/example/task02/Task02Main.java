package com.example.task02;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import static java.lang.System.in;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        InputStream input = System.in;
        OutputStream out = System.out;
        int firstByte;
        int nextByte;
        while((firstByte = input.read()) >= 0){
            if (firstByte != 13){
                out.write(firstByte);
                continue;
            }
            input.mark(1);
            nextByte = input.read();
            if (nextByte < 0){
                out.write(firstByte);
                break;
            }
            if (nextByte == 10){
                out.write(10);
            } else{
                out.write(firstByte);
                input.reset();
            }
        }
        input.close();
        out.close();
    }
}
