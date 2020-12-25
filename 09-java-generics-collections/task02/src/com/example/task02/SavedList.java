package com.example.task02;
import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    List<E> list;
    File file;

    public SavedList(File file) {
        this.file = file;
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                list = (List<E>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                list = new ArrayList<>();
            }
        } else {
            list = new ArrayList<>();
        }
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E e = list.set(index, element);
        saveList();
        return e;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        saveList();
    }

    @Override
    public E remove(int index) {
        E e = list.remove(index);
        saveList();
        return e;
    }
    private void saveList() {
        try {
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    throw new IOException();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))) {
            os.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
