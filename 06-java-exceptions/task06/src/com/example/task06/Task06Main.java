package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }
    void printMethodName(){
        System.out.print(new Exception().getStackTrace()[1].getMethodName());
    }
}