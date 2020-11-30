package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        printMethodName();
    }

    public static void printMethodName() {
        try {
            throw new Exception();
        }
        catch (Exception e){
            StackTraceElement[] stackTraceElement = e.getStackTrace();
            System.out.print(stackTraceElement[1].getMethodName() + "\n");
        }
    }

}