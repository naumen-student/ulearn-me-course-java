package com.example.task02;

import java.io.*;
import java.util.*;

public class SavedList<E extends Serializable> extends AbstractList<E> implements Serializable{

    ArrayList<E> list;
    private final File file;

    public SavedList(File file){
        this.file = file;
        list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            list = ((SavedList<E>) ois.readObject()).list;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void update(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E el = list.set(index, element);
        update();
        return el;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        update();
    }

    @Override
    public E remove(int index) {
        E el = list.remove(index);
        update();
        return el;
    }
}
