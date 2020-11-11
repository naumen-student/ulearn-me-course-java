package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private List<E> list = new ArrayList<>();
    private final File file;

    public SavedList(File file) throws IOException {

        this.file = file;
        if (file.exists()) {
            try (ObjectInputStream data = (new ObjectInputStream(new FileInputStream(file)))) {
                list = (List<E>) data.readObject();
            } catch (Exception ignored) {
            }
        } else {
            this.file.createNewFile();
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
