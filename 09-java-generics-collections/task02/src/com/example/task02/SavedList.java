package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<T extends Serializable> extends AbstractList<T> {
    private List<T> list = new ArrayList<>();
    private final File file;

    public SavedList(File file) throws IOException {
        if (file.exists()) {
            try (
                    FileInputStream inputStream = new FileInputStream(file);
                    ObjectInputStream stream = new ObjectInputStream(inputStream)) {
                list = (ArrayList<T>) stream.readObject();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        } else
            file.createNewFile();
        this.file = file;
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T set(int index, T element) {
        T newbie = list.set(index, element);
        update();
        return newbie;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, T element) {
        list.add(index, element);
        update();
    }

    @Override
    public T remove(int index) {
        T corpse = list.remove(index);
        update();
        return corpse;
    }

    private void update() {
        try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}