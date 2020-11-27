package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }

    void printMethodName() {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.print(methodName);
    }

}