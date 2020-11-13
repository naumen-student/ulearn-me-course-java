package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private ArrayList<E> list;
    private final File file;

    public SavedList(File file) {
        this.file = file;
        list = new ArrayList<>();
        if (file.exists())
            load();
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E item = list.set(index, element);
        update();
        return item;
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
        E item = list.remove(index);
        update();
        return item;
    }

    private void update() {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            output.writeObject(list);
            output.flush();
            output.close();
        } catch (IOException ignored) {
        }
    }

    private void load(){
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            list = (ArrayList<E>) input.readObject();
            input.close();
        } catch (Exception ignored) {;
        }
    }
}
