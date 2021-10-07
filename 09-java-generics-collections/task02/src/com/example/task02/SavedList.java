package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private List<E> data;
    private final File currentFile;

    public SavedList(File file) {
        currentFile = file;

        if (!file.exists()) {
            try {
                file.createNewFile();
                data = new ArrayList<>();
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }
        else loadFromFile();
    }

    private void loadFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(currentFile))){
            data = (List<E>) inputStream.readObject();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    private void saveToFile() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(currentFile))){
            stream.writeObject(data);
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return data.get(index);
    }

    @Override
    public E set(int index, E element) {
        E value = data.set(index, element);
        saveToFile();
        return value;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void add(int index, E element) {
        data.add(index, element);
        saveToFile();
    }

    @Override
    public E remove(int index) {
        E value = data.remove(index);
        saveToFile();
        return value;
    }
}