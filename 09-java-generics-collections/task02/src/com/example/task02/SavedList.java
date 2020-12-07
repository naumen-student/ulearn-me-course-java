package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private final File file;
    private ArrayList<E> items;

    public SavedList(File currentFile) {
        this.file = currentFile;
        items = new ArrayList<E>();
        readFromFile();
    }

    private void readFromFile() {
        try (FileInputStream fileIS = new FileInputStream(file)) {
            ObjectInputStream objectIS = new ObjectInputStream(fileIS);
            items = (ArrayList<E>) objectIS.readObject();
            objectIS.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void writeToFile() {
        try (FileOutputStream fileOS = new FileOutputStream(file)) {
            ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
            objectOS.writeObject(items);
            objectOS.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public E get(int position) {
        return items.get(position);
    }

    @Override
    public void add(int position, E item) {
        items.add(position, item);
        writeToFile();
    }

    @Override
    public E set(int position, E element) {
        E item = items.set(position, element);
        writeToFile();
        return item;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public E remove(int position) {
        E item = items.remove(position);
        writeToFile();
        return item;
    }
}
