package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private ArrayList<E> list;

    public SavedList(File file) {
        this.file = file;
        list = new ArrayList<>();
        readFromFile();

    }

    private void readFromFile() {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file))) {
            list = (ArrayList<E>) obj.readObject();
        } catch (Exception ignored) { }
    }

    @Override
    public E get(int index) { return list.get(index); }

    @Override
    public E set(int index, E element) {
        E item = list.set(index, element);
        writeToFile();
        return item;
    }

    private void writeToFile() {
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file)) ) {
            obj.writeObject(list);
        } catch (IOException ignored) { }
    }

    @Override
    public int size() { return list.size(); }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        writeToFile();
    }

    @Override
    public E remove(int index) {
        E item = list.remove(index);
        writeToFile();
        return item;
    }
}
