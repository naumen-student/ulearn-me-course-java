package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private List<E> list = new ArrayList<E>();

    public SavedList(File file) throws IOException {
        if (file.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                list = (ArrayList<E>)objectInputStream.readObject();
            } catch (ClassNotFoundException | IOException exception) { exception.printStackTrace(); }
        }
        else
            file.createNewFile();
        this.file = file;
    }

    private void writeListToFile() {
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E e = list.set(index, element);
        writeListToFile();
        return e;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        writeListToFile();
    }

    @Override
    public E remove(int index) {
        E e = list.remove(index);
        writeListToFile();
        return e;
    }
}
