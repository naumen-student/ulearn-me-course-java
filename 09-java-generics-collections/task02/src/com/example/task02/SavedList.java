package com.example.task02;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SavedList<E extends Serializable> extends AbstractList<E> {

    private List<E> repository = new ArrayList<>();
    private final File currentFile;

    public SavedList(File file) throws IOException
    {
        currentFile=file;

        if (file.exists())
            readAndWrite();
        else
            file.createNewFile();
    }

    @Override
    public E get(int index)
    {
        return repository.get(index);
    }

    @Override
    public E set(int index, E element)
    {
        E set = repository.set(index, element);
        rewriteFile();
        return set;
    }

    @Override
    public int size()
    {
        return repository.size();
    }

    @Override
    public void add(int index, E element)
    {
        repository.add(index, element);
        rewriteFile();
    }

    @Override
    public E remove(int index)
    {
        E removed = repository.remove(index);
        rewriteFile();
        return removed;
    }

    private  void rewriteFile()
    {
        try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(currentFile))) {
            for (Object x: repository)
                stream.writeObject(x);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private  void readAndWrite()
    {
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(currentFile)))
        {
            while (true)
                repository.add((E) stream.readObject());
        }
        catch (Exception ignored)
        {}
    }
}
