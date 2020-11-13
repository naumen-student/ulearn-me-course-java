package com.example.task02;

import java.io.*;
import java.util.*;

public class SavedList<E extends Serializable> extends AbstractList<E>
{
    private List<E> data = new ArrayList<>();
    private final File fileData;


    public SavedList(File file) throws IOException
    {
        if(file.exists())
        {
            try (FileInputStream inputStream = new FileInputStream(file);
                 ObjectInputStream stream = new ObjectInputStream(inputStream))
            {
                data = (List<E>) stream.readObject();
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        else
            file.createNewFile();
        this.fileData = file;
    }

    @Override
    public E get(int index)
    {
        return data.get(index);
    }

    @Override
    public int size()
    {
        return data.size();
    }

    @Override
    public E set(int index, E element)
    {
        E setedElement = data.set(index, element);
        updateFile();
        return setedElement;
    }

    @Override
    public void add(int index, E element)
    {
        data.add(index, element);
        updateFile();
    }

    @Override
    public E remove(int index)
    {
        E removedElement = data.remove(index);
        updateFile();
        return removedElement;
    }

    private void updateFile()
    {
        try(FileOutputStream fos = new FileOutputStream(fileData);
            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(data);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}