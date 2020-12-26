package com.example.task05;

import java.util.HashMap;
import java.util.Collections;

public class MyHashMap<T> extends HashMap {
    @Override
    public Object get(Object key) {
        if (super.get(key) == null) {
            return Collections.<T>emptyList();
        }
        return super.get(key);
    }
}
