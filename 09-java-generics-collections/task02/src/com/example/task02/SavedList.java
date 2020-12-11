package com.example.task02;

import java.io.File;
import java.io.Serializable;
import java.util.AbstractList;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private List<E> items;

    public SavedList(File file) {
        this.file = file;
        if (!checkItemsInFile())
            items = new ArrayList<E>();
    }

    private boolean checkItemsInFile() {
        try {
            FileInputStream inputFile = new FileInputStream(file);
            try (ObjectInputStream stream = new ObjectInputStream(inputFile)) {
                items = (List<E>) stream.readObject();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private void writeItemsInFile() {
        try {
            FileOutputStream outputFile = new FileOutputStream(file);
            try (ObjectOutputStream inputFile = new ObjectOutputStream(outputFile)) {
                inputFile.writeObject(items);
            }
        } catch (IOException ignored) {
        }
    }

    @Override
    public E get(int index) {
        return items.get(index);
    }

    @Override
    public E set(int index, E element) {
        E e = items.set(index, element);
        writeItemsInFile();
        return e;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(int index, E element) {
        items.add(index, element);
        writeItemsInFile();
    }

    @Override
    public E remove(int index) {
        E e = items.remove(index);
        writeItemsInFile();
        return e;
    }
}
