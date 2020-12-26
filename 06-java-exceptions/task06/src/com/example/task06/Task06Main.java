package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

}