package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        if(inputStream == null || charset == null){
            throw new IllegalArgumentException();
        }
        byte now;
        ArrayList<Byte> A = new ArrayList<Byte>();
        while (true){
            now = (byte)inputStream.read();
            if(now == -1) break;
            A.add(now);
        }
        byte[] b = new byte[A.size()];
        for(int i = 0; i < A.size(); i++){
            b[i] = A.get(i);
        }
        String res = new String(b, charset.displayName());
        return res;
    }
}
