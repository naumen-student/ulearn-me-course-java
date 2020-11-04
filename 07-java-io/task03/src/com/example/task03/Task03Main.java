package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        byte[] symbols;
        int count = 0;
        try{
            symbols = new byte[inputStream.available()];
            for(int i = inputStream.read(); i != -1; i = inputStream.read())
                symbols[count++] = (byte)i;
        }
        catch (NullPointerException e){
            throw new IllegalArgumentException();
        }
        catch (IOException e) {
            throw new IllegalArgumentException();
        }
        // your implementation here
        return new String(symbols, charset);
    }
}
