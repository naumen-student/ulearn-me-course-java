package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> bytes = new ArrayList<Integer>();
        for (int i = System.in.read(); i != -1; i = System.in.read())
            bytes.add(i);
        for (int i = 0; i < bytes.size() - 1; i++)
            if (bytes.get(i) == 13 && bytes.get(i + 1) == 10)
                bytes.remove(i);
        for (int i = 0; i < bytes.size(); i++)
            System.out.write( bytes.get(i));
    }
}
