package com.example.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
        */
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe","-v", "error", "-of", "flat", "-show_format", file.getName())
                .directory(new File(file.getParent()));

        Process process = processBuilder.start();
        String soundName;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
            soundName = reader.lines()
                    .filter(string -> string.startsWith("format.tags.title"))
                    .findFirst()
                    .toString()
                    .split("\"")[1];
        }
        return soundName;
    }
}
