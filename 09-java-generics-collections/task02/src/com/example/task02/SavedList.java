package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private final File file;
    private List<E> list;

    public SavedList(File file) {
        this.file = file;
        this.list = new ArrayList<>();
        if(file.exists()){
            try (ObjectInputStream data = new ObjectInputStream(new FileInputStream(file))) {
                list = (List<E>) data.readObject();
            }
            catch (Exception e) {
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
        E newElement = list.set(index, element);
        updateFile();
        return newElement;
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
        E removedElement = list.remove(index);
        updateFile();
        return removedElement;
    }

    private void updateFile(){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
