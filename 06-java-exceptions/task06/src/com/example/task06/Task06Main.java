package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        // Получили текущий stacktrace и взяли из него нужный элемент
        System.out.print(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}
