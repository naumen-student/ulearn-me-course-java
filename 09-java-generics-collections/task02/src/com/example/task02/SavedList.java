package com.example.task02;

import java.io.File;
import java.io.Serializable;
import java.util.AbstractList;
import java.io.*;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    java.util.List<E> list;
    File file;

    public SavedList(File file) {
        this.file = file;
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                list = (java.util.List<E>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                list = new java.util.ArrayList<>();
            }
        }
        else {
            list = new java.util.ArrayList<>();
        }
    }

    private void Update() {
        try (ObjectOutputStream data = (new ObjectOutputStream(new FileOutputStream(file)))) {
            data.writeObject(list);
        } catch (Exception ignored) {
        }
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        list.set(index, element);
        Update();
        return element;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        Update();
    }

    @Override
    public E remove(int index) {
        E result = list.get(index);
        list.remove(index);
        Update();
        return result;
    }
}
