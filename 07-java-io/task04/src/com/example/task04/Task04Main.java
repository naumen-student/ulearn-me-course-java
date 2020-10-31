package com.example.task04;

import java.io.IOException;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNextDouble()){
            sum += scanner.nextDouble();
        }
        System.out.printf("%.6f%n", sum);
    }
}
