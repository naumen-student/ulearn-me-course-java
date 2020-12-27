package com.example.task02;

import java.io.File;
import java.io.Serializable;
import java.util.AbstractList;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    public SavedList(File file) {
        List<E> list;

        if (!file.exists()){
            list = new ArrayList<>();
        } else {
            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(file))) {
                list = (List<E>) is.readObject();
            } catch (IOException | ClassNotFoundException e) {
                list = new ArrayList<>();
            }
        }

        this.list = list;
        this.file = file;
    }

    private final File file;
    private final List<E> list;

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        list.set(index, element);
        updateFile();
        return list.get(index);
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
        E e = list.remove(index);
        updateFile();
        return e;
    }
}
