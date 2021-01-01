package com.example.task01;

import java.util.HashSet;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        HashSet<Integer> temp = null;
        temp.size();
    }
}
