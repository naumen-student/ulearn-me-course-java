package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private List<E> list;
    private final File file;

    public SavedList(File file) {
        this.file = file;
        boolean flag = false;
        try {
            FileInputStream inputFile = new FileInputStream(file);
            try (ObjectInputStream stream = new ObjectInputStream(inputFile)) {
                list = (List<E>) stream.readObject();
                flag = true;
            }
        } catch (Exception ignored) {
        }
        if (!flag)
            list = new ArrayList<>();
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        list.set(index, element);
        updateFile();
        return element;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        updateFile();
    }

    @Override
    public E remove(int index) {
        E result = list.get(index);
        list.remove(index);
        updateFile();
        return result;
    }

    private void updateFile() {
        try (ObjectOutputStream data = (new ObjectOutputStream(new FileOutputStream(file)))) {
            data.writeObject(list);
        } catch (Exception ignored) {
        }
    }
}
