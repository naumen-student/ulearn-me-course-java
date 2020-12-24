package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task01Main {
    public static void main(String[] args) throws IOException{
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */
    }

    public static Integer sum(ArrayList<Integer> a, int now){
        if(now <= 0) return a.get(0);
        else return Integer.rotateLeft(sum(a, now-1), 1) ^ a.get(now);

    }


    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
        if(inputStream == null){
            throw new IllegalArgumentException();
        }
        int res = 0, now;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(true){
            now = inputStream.read();
            if(now == -1) break;
            else a.add(now);
        }
        if (a.size() == 0) return 0;
        return sum(a, a.size()-1);
    }
}
