package com.example.task02;

import java.io.*;
import java.util.Scanner;

public class Task02Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\DS\\IdeaProjects\\ulearn-me-course-java\\09-java-generics-collections\\task02\\list3.dat");

        System.out.println(file);
        SavedList<String> list1 = new SavedList<>(file);
        list1.add("Z");
        list1.add("Z");
        list1.add("Z");
        System.out.println("list1: " + list1);

        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream( new FileInputStream(file).readAllBytes()));
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
        }
        catch (FileNotFoundException | ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (EOFException e){

        }

        /*SavedList<String> list2 = new SavedList<>(file);
        System.out.println("list2: " + list2);*/

    }

}
