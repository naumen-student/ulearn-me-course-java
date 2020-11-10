package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> implements Serializable{
    private ArrayList<E> list;
    private File file;

    public SavedList(File file) {
        this.file = file;
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            this.list = (ArrayList)objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            this.list = new ArrayList<>();
        }
    }

    @Override
    public E get(int index) {
        return this.list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E toReturn = this.list.set(index, element);
        this.tryWriteToFile(this.file);
        return toReturn;
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public void add(int index, E element) {
        this.list.add(index, element);
        this.tryWriteToFile(this.file);
    }

    @Override
    public E remove(int index) {
        E toReturn = this.list.remove(index);
        this.tryWriteToFile(this.file);
        return toReturn;
    }

    public void tryWriteToFile(File file){
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(this.list);
            outputStream.close();
        } catch (Exception e){ }
    }
}
