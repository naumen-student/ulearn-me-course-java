package com.example.task02;

import java.io.File;
import java.io.Serializable;
import java.util.AbstractList;
import java.io.*;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private final File file;
    private ArrayList<E> items;

    public SavedList(File file) {
        this.file = file;
        items = new ArrayList<E>();
        readFromFile();
    }

    @Override
    public E get(int index) {
        return items.get(index);
    }

    @Override
    public E set(int index, E element) {
        E item = items.set(index, element);
        writeToFile();
        return item;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(int index, E element) {
        items.add(index, element);
        writeToFile();
    }

    @Override
    public E remove(int index) {
        E item = items.remove(index);
        writeToFile();
        return item;
    }

    private void readFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                items = (ArrayList<E>) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(items);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
