package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        from0to10000();
    }

    static void from0to10000() {
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            actual.append(i);
            actual.append(System.lineSeparator());
        }
        System.out.println(actual);
    }
}