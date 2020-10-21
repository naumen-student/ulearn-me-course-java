package com.example.task06;

public class Task06Main {
    void printMethodName() {
        System.out.print(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}