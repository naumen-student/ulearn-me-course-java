package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        try {
            throw new IllegalArgumentException();//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getStackTrace()[1].getMethodName());
        }
    }

}