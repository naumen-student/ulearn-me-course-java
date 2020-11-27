package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }

     void printMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[2].getMethodName());
    }

}