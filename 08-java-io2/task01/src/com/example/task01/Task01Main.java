package com.example.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));

    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        String res = "";


        Scanner sc = new Scanner(processBuilder.start().getInputStream());
        while (sc.hasNextLine()) {
            String curr = sc.nextLine();
            if (curr.startsWith("format.tags.title"))
            return curr.split("\"")[1];
        }
        return null;
    }
}
