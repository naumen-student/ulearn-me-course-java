package com.example.task01;

import java.lang.reflect.Array;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        Array arr = null;
        String len = arr.toString();
    }
}
