package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private final File file;
    private List<E> eList;

    public SavedList(File file) {
        this.file = file;
        eList = new ArrayList<E>();
        readFile();
    }

    @Override
    public E get(int index) {
        return eList.get(index);
    }

    @Override
    public E set(int index, E element) {
        E elem = eList.set(index, element);
        writeInFile();
        return elem;
    }

    @Override
    public int size() {
        return eList.size();
    }

    @Override
    public void add(int index, E element) {
        eList.add(index, element);
        writeInFile();
    }

    @Override
    public E remove(int index) {
        E elem = eList.remove(index);
        writeInFile();
        return elem;
    }

    private void readFile(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
                eList = (ArrayList<E>) objectInputStream.readObject();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void writeInFile(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
                objectOutputStream.writeObject(eList);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
