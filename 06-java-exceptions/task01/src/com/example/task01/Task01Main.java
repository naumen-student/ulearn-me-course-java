package com.example.task01;
import java.util.Date;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        Date date = null;
        date.getTime();
    }
}
