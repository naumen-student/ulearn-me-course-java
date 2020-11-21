package com.example.task02;

import java.io.File;
import java.io.IOException;

public class Task02Main {

    public static void main(String[] args) throws IOException {

        File file = new File("./testlist.dat");

        SavedList<String> list1 = new SavedList<>(file);
        list1.add("Z");
        System.out.println("list1: " + list1);

        SavedList<String> list2 = new SavedList<>(file);
        System.out.println("list2: " + list2);

    }

}
