package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private ArrayList<E> list = new ArrayList<>();

    public SavedList(File file) throws IOException {
        if (file.exists()) {
            try (
                    FileInputStream fileInputStream = new FileInputStream(file);
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                list = (ArrayList<E>) objectInputStream.readObject();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else
            file.createNewFile();
        this.file = file;
    }

    private void updateFile() {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(list);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
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
        E element = list.remove(index);
        updateFile();
        return element;
    }
}
