package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        String nameMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.print(nameMethod);
    }

}