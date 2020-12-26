package com.example.task02;

import java.util.AbstractList;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private List<E> items;

    public SavedList(File file) {
        this.file = file;
        items = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            items = ((SavedList<E>) ois.readObject()).items;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return items.get(index);
    }

    @Override
    public E set(int index, E element) {
        E item = items.set(index, element);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(items);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(int index, E element) {
        items.add(index, element);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(items);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E remove(int index) {
        E item = items.remove(index);
        try {
            FileOutputStream outputFile = new FileOutputStream(file);
            try (ObjectOutputStream inputFile = new ObjectOutputStream(outputFile)) {
                inputFile.writeObject(items);
            }
        } catch (IOException ignored) {
        }
        return item;
    }
}
