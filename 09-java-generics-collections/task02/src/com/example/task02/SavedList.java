package com.example.task02;

import java.io.*;
import java.util.AbstractList;
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
    public E get(int i) {
        return items.get(i);
    }

    @Override
    public E set(int i, E element) {
        E item = items.set(i, element);
        writeToFile();
        return item;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(int i, E element) {
        items.add(i, element);
        writeToFile();
    }

    @Override
    public E remove(int i) {
        E item = items.remove(i);
        writeToFile();
        return item;
    }

    private void readFromFile() {
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            items = (ArrayList<E>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(items);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}