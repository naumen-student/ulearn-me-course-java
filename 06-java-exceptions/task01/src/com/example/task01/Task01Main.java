package com.example.task01;
import java.util.ArrayList;

public class Task01Main {
    public static void main(String[] args) {
    }

    static void codeWithNPE() {

        ArrayList<String> s = null;
        s.add("");
    }
}
