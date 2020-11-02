package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Task03Main{
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException{
        if ( inputStream == null )
            throw new IllegalArgumentException();
        List<String> result = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset))) {
            return reader.readLine();
        }
    }
}
