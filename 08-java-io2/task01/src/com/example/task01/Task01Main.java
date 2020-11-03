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
        processBuilder.command("ffprobe",
                "-v", "error",
                "-of", "flat",
                "-show_format",
                "file.mp3",
                file.getAbsolutePath());
        Process process = processBuilder.start();
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("format.tags.title")) {
                    return line.substring(19, line.length() - 1);
                }
            }
        }
        return null;
    }
}
