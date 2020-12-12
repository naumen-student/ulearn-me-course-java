package com.example.task02;

import java.io.File;
import java.io.Serializable;
import java.io.*;
import java.nio.file.Files;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    public List<E> collection;
    public File file;

    public SavedList(File file) {
        collection = new LinkedList<E>();
        this.file = file;
        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(file.toPath()))) {
                collection = (List<E>) objectInputStream.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public E get(int index) {
        return collection.get(index);
    }

    @Override
    public E set(int index, E element) {
        E result = collection.set(index, element);
        CheckFile();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()))) {
            objectOutputStream.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int size() {
        return collection.size();
    }

    @Override
    public void add(int index, E element) {
        collection.add(index, element);
        CheckFile();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()))) {
            objectOutputStream.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void CheckFile() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public E remove(int index) {
        E result=collection.remove(index);
        CheckFile();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()))) {
            objectOutputStream.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
