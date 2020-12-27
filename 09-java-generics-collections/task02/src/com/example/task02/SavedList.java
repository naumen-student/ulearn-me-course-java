package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private final List<E> items = new ArrayList<E>();

    public SavedList(File file) {
        this.file = file;
        refreshRead();
    }

    @Override
    public E get(int index) {
        return items.get(index);
    }

    @Override
    public E set(int index, E element) {
        E e = items.set(index, element);
        refreshWrite();
        return e;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(int index, E element) {
        items.add(index, element);
        refreshWrite();
    }

    @Override
    public E remove(int index) {
        E e = items.remove(index);
        refreshWrite();
        return e;
    }

    private void refreshRead(){
        try {
            FileInputStream inputStream = new FileInputStream(file);
            try (ObjectInputStream stream = new ObjectInputStream(inputStream)) {
                items.addAll((List<E>) stream.readObject());
            }
        } catch (Exception ignored) {}

    }

    private void refreshWrite(){
        try {
            FileOutputStream stream = new FileOutputStream(file);
            try (ObjectOutputStream inputStream = new ObjectOutputStream(stream)) {
                inputStream.writeObject(items);
            }
        } catch (IOException ignored) {}
    }
}
