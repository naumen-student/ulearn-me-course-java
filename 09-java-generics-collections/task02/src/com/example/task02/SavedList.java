package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E>{
    private final File file;
    private final List<E> items = new ArrayList<E>();

    public SavedList(File file){
        this.file = file;
       tryReadItemsFromFile();
    }

    @Override
    public E get(int index){
        return items.get(index);
    }

    @Override
    public void add(int index, E e){
        items.add(index, e);
        tryWriteItemsToFile();
    }

    @Override
    public E remove(int index){
        E e = items.remove(index);
        tryWriteItemsToFile();
        return e;
    }

    @Override
    public int size(){
        return items.size();
    }

    @Override
    public E set(int index, E el){
        E e = items.set(index, el);
        tryWriteItemsToFile();
        return e;
    }

    private void tryReadItemsFromFile(){
        try {
            FileInputStream inputStream = new FileInputStream(file);
            try (ObjectInputStream stream = new ObjectInputStream(inputStream)) {
                items.addAll((List<E>) stream.readObject());
            }
        } catch (Exception ignored) {}

    }

    private void tryWriteItemsToFile(){
        try {
            FileOutputStream stream = new FileOutputStream(file);
            try (ObjectOutputStream inputStream = new ObjectOutputStream(stream)) {
                inputStream.writeObject(items);
            }
        } catch (IOException ignored) {}
    }
}