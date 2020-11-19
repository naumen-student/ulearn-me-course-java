package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    public File file;
    public List<E> list;

    public SavedList(File file) throws IOException {
        this.list = new ArrayList<E>();
        if (file.exists()) {
            try {
                ObjectInputStream object = new ObjectInputStream(Files.newInputStream(file.toPath()));
                list = (List<E>) object.readObject();
                this.file = file;

            } catch (Exception e) {
            }
        } else {
            this.file = new File(file.getAbsolutePath());
        }
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E listObject = list.set(index, element);
        try {
            ObjectOutputStream object = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            object.writeObject(list);
        } catch (Exception e) {
        }
        return listObject;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        try {
            ObjectOutputStream object = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            object.writeObject(list);
        } catch (Exception e) {
        }
    }

    @Override
    public E remove(int index) {
        E removedObject = list.remove(index);
        try {
            ObjectOutputStream object = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            object.writeObject(list);
        } catch (Exception e) {
        }
        return removedObject;
    }
}
