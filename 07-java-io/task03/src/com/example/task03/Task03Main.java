package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("07-java-io/task03/src/com/example/task03/input.test"), Charset.forName("ASCII")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        try {
            Scanner scan = new Scanner(new InputStreamReader(inputStream, charset));
            String line = "";
            while (scan.hasNextLine()) {
                line += scan.nextLine();
                if(scan.hasNextLine())
                    line += "\n";
            }
            return line;
        }
        catch (RuntimeException e){
            throw new IllegalArgumentException();
        }
    }
}
