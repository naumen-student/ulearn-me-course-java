package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private List<E> list = new ArrayList<>();
    private final File file;

    public SavedList(File file) {
        this.file = file;
        if (file.exists()) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                list = (ArrayList<E>) objectInputStream.readObject();
                objectInputStream.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            list = new ArrayList<>();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        list.set(index, element);
        update();
        return element;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        update();
    }

    @Override
    public E remove(int index) {
        E removedElement = list.remove(index);
        update();
        return removedElement;
    }

    private void update() {
        try (ObjectOutputStream data = (new ObjectOutputStream(new FileOutputStream(file)))) {
            data.writeObject(list);
        } catch (Exception ignored) {
        }
    }
}
