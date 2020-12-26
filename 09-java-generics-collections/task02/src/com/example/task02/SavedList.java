package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E>{
    private final File file;
    private List<E> items;

    public SavedList(File file){
        this.file = file;
        if ( !tryReadItemsFromFile() )
            items = new ArrayList<E>();
    }

    private boolean tryReadItemsFromFile(){
        try {
            FileInputStream inputStream = new FileInputStream(file);
            try (ObjectInputStream stream = new ObjectInputStream(inputStream)) {
                items = (List<E>) stream.readObject();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private void tryWriteItemsToFile(){
        try {
            FileOutputStream stream = new FileOutputStream(file);
            try (ObjectOutputStream inputStream = new ObjectOutputStream(stream)) {
                inputStream.writeObject(items);
            }
        } catch (IOException ignored) {
        }
    }

    @Override
    public E get(int index) {
        return items.get(index);
    }

    @Override
    public E set(int index, E element){
        E el = items.set(index, element);
        tryWriteItemsToFile();
        return el;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(int index, E element) {
        items.add(index, element);
        tryWriteItemsToFile();
    }

    @Override
    public E remove(int index) {
        E el = items.remove(index);
        tryWriteItemsToFile();
        return el;
    }
}
