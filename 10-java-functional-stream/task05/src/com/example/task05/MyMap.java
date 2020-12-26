package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyMap<T> extends HashMap<String, List<T>> {
    @Override
    public List<T> get(Object key) {
        return super.containsKey (key) ? super.get (key) : new ArrayList<T> ();
    }
}