package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private List<E> memory;
    private File file;

    public SavedList(File file){
        memory = new ArrayList<>();
        this.file = file;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            FileInputStream is = new FileInputStream(file);
            while (is.available() > 0)
                memory.add((E)ois.readObject());
            ois.close();
            is.close();
        }
        catch (FileNotFoundException e){
            System.out.println("3434");
        }
        catch (IOException e){
            System.out.println("Error");
        }
        catch (ClassNotFoundException e){
            System.out.println("Error");
        }
    }

    public void writeFile(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            for(E item : memory)
                oos.writeObject(item);
            oos.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return memory.get(index);
    }

    @Override
    public E set(int index, E element) {
        memory.set(index, element);
        writeFile();
        return element;
    }

    @Override
    public int size() {
        return memory.size();
    }

    @Override
    public void add(int index, E element) {
        memory.add(index, element);
        writeFile();
    }

    @Override
    public E remove(int index) {
        E result = memory.remove(index);
        writeFile();
        return result;
    }
}
