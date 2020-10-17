package com.example.task01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        codeWithNPE();
         */
    }

    static void codeWithNPE() {
        HashMap<String, Integer> map = null;
        map.put("", new Integer(1));
        //throw new NullPointerException();
    }
}
