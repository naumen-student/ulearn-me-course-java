package com.example.task01;

import java.io.*;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        String res = "";
        try {
            InputStream inputStream = Runtime.getRuntime().exec("ffprobe -v error -of flat -show_format " + file)
                    .getInputStream();
            Scanner scanner = new Scanner(inputStream);
            String str;
            while (scanner.hasNextLine())
                if ((str=scanner.nextLine()).contains("format.tags.title")) res = str.split("\"")[1];
            System.out.println();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return res;
    }
}
