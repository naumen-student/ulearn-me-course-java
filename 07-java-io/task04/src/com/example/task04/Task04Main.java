package com.example.task04;

import java.io.IOException;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        while(scanner.hasNextLine()){
            String[] inputs = scanner.nextLine().split(" ");
            for(int i = 0; i < inputs.length; i++) {
                try {
                    sum += Double.parseDouble(inputs[i]);
                } catch (NumberFormatException e) {}
            }
        }
        System.out.println(String.format("%.6f", sum).replace(",", "."));
    }
}
