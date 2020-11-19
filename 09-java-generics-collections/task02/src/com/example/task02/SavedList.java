package com.example.task02;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final ArrayList<E> values;
    private ObjectOutputStream objectOutputStream;
    private final File file;

    public SavedList(File file) {
        this.file = file;
        values = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(file.toPath()));
            while (true) {
                try {
                    values.add((E) objectInputStream.readObject());
                } catch (Exception e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        try {
            objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void saveAll() {
        file.delete();
        try {
            file.createNewFile();
            objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            for (E value : values) {
                objectOutputStream.writeObject(value);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public E get(int index) {
        return values.get(index);
    }

    @Override
    public E set(int index, E element) {
        values.set(index, element);
        saveAll();
        return values.get(index);
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public void add(int index, E element) {
        values.add(index, element);
        try {
            objectOutputStream.writeObject(element);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public E remove(int index) {
        E value = values.remove(index);
        saveAll();
        return value;
    }
}
