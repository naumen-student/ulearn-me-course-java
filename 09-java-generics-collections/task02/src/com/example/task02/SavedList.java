package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private List<E> items;


    public SavedList(File file) {
        this.file = file;
        this.items = getItemsFromFile(this.file);
    }

    private List<E> getItemsFromFile(File file) {
        try {
            FileInputStream inputFile = new FileInputStream(file);
            try (ObjectInputStream stream = new ObjectInputStream(inputFile)) {
                return (List<E>) stream.readObject();
            }
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void saveItemsIntoFile() {
        try {
            FileOutputStream outputFile = new FileOutputStream(file);
            try (ObjectOutputStream stream = new ObjectOutputStream(outputFile)) {
                stream.writeObject(items);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public E get(int index) {
        return this.items.get(index);
    }

    @Override
    public E set(int index, E element) {
        E e = this.items.set(index, element);
        saveItemsIntoFile();
        return e;
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public void add(int index, E element) {
        this.items.add(index, element);
        saveItemsIntoFile();
    }

    @Override
    public E remove(int index) {
        E e = this.items.remove(index);
        saveItemsIntoFile();
        return e;
    }
}
