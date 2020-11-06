package com.example.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
        */
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(String.format("ffprobe -v error -of flat -show_format %s",
                file.getAbsolutePath()));

        Process p = pb.start();

        try (Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()))) {
            while(sc.hasNextLine()) {
                String l = sc.nextLine();
                if (l.contains("format.tags.title"))
                    return l.split("\"")[1];
            }
        }

        throw new IllegalArgumentException();
    }
}
