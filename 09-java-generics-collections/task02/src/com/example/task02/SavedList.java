package com.example.task02;

import java.io.File;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.io.*;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private ArrayList<E> items = new ArrayList<E>();
    
    public SavedList(File file) {
        this.file = file;
        readFromFile();
    }

    private void readFromFile() {
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            items = (ArrayList<E>)objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
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
        writeToFile();
        return item;
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

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(int index, E element) {
        items.add(index, element);
    }

    @Override
    public E remove(int index) {
        E item = items.remove(index);
        writeToFile();
        return item;
    }
}
