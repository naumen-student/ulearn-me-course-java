package com.example.task01;

import java.io.*;
import java.util.ArrayList;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        String res = "";
        try {
            InputStream inputStream = Runtime.getRuntime().exec("ffprobe -v error -of flat -show_format " + file)
                    .getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = br.readLine()) != null)
                if (str.contains("format.tags.title")) res = str.split("\"")[1];
            System.out.println();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return res;
    }
}
