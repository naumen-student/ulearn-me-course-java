package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private final File file;
    private ArrayList<E> list;

    public SavedList(File file) throws IOException {
        this.file = file;
        list = new ArrayList<>();
        if (file.exists())
            readItemsFromFile();
        else
            file.createNewFile();
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E el = list.set(index, element);
        updateFile();
        return el;
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
        E el = list.remove(index);
        updateFile();
        return el;
    }

    private void readItemsFromFile() throws IOException{
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file))) {
            list = (ArrayList<E>) stream.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private void updateFile(){
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file))) {
            stream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
