package com.example.task02;

import org.assertj.core.util.Arrays;

import java.awt.*;
import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> {
    private File savFile;
    private ArrayList<E> list = new ArrayList<E>();

    public SavedList(File file) throws IOException {
        if (file.exists()){
            try (FileInputStream fileStr = new FileInputStream(file)){
                ObjectInputStream objStr = new ObjectInputStream(fileStr);
                list = (ArrayList<E>)(objStr.readObject());
                objStr.close();
            } catch (ClassNotFoundException | IOException exception) {
                exception.printStackTrace();
            }
        }
        else
            file.createNewFile();
        this.savFile = file;
    }

    public void WriteToFile(){
        try (FileOutputStream fileInputStream = new FileOutputStream(savFile)){
            ObjectOutputStream outputStream  = new ObjectOutputStream(fileInputStream);
            outputStream.writeObject(list);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        E e = list.set(index, element);
        WriteToFile();
        return e;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        WriteToFile();
    }

    @Override
    public E remove(int index) {
        E e = list.remove(index);
        WriteToFile();
        return e;
    }
}
