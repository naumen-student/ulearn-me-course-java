package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    public List<E> collection;

    public SavedList(File file) {
        this.file = file;
        collection = new ArrayList<>();
        readCollectionInFile();
    }

    @Override
    public E get(int index) {
        return collection.get(index);
    }

    @Override
    public E set(int index, E element) {
        E elem = collection.set(index, element);
        writeCollectionInFile();
        return elem;
    }

    @Override
    public int size() {
        return collection.size();
    }

    @Override
    public void add(int index, E element) {
        collection.add(index, element);
        writeCollectionInFile();
    }

    @Override
    public E remove(int index) {
        E elem = collection.remove(index);
        writeCollectionInFile();
        return elem;
    }

    private void writeCollectionInFile() {
        try {
            FileOutputStream outputFile = new FileOutputStream(file);
            try (ObjectOutputStream inputFile = new ObjectOutputStream(outputFile)) {
                inputFile.writeObject(collection);
            }
        } catch (IOException ignored) {
        }
    }

    private void readCollectionInFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                collection = (ArrayList<E>) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
