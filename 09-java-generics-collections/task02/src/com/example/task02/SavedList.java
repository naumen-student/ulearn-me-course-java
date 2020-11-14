package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private final List<E> elements;
    private final File file;

    public SavedList(File file) {
        this.file = file;
        elements = loadElements(file);
    }

    private List<E> loadElements(File fileToLoad){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileToLoad))){
            return (List<E>) objectInputStream.readObject();
        }
        catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void saveElementsInFile(){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            objectOutputStream.writeObject(elements);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return elements.get(index);
    }

    @Override
    public E set(int index, E element) {
        E currentElement = elements.set(index, element);
        saveElementsInFile();
        return currentElement;
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public void add(int index, E element) {
        elements.add(index, element);
        saveElementsInFile();
    }

    @Override
    public E remove(int index) {
        E currentElement = elements.remove(index);
        saveElementsInFile();
        return currentElement;
    }
}