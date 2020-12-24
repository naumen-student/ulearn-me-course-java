package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    public SavedList(File file) {

        this.file = file;
        loadData();
    }

    private final File file;
    private List<E> items;

    private void loadData(){
        if (file.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                items = (List<E>) inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            items = new ArrayList<>();
        }
    }

    private void saveData() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {

        loadData();
        return items.get(index);
    }

    @Override
    public E set(int index, E element) {

        loadData();
        E result = items.set(index, element);
        saveData();
        return result;
    }

    @Override
    public int size() {

        loadData();
        return items.size();
    }

    @Override
    public void add(int index, E element) {

        loadData();
        items.add(index, element);
        saveData();
    }

    @Override
    public E remove(int index) {

        loadData();
        E result = items.remove(index);
        saveData();
        return result;
    }
}
