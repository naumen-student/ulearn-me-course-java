package com.example.task06;

public class Task06Main {

    void printMethodName() {
        StackTraceElement element = new Exception().getStackTrace()[1];
        System.out.print(element.getMethodName());
    }
}