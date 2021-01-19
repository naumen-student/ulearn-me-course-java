package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Process process = builder.start();
        Scanner scanner = new Scanner(process.getInputStream());
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("format.tags.title")) {
                return line.split("\"")[1];
            }
        }
        return null;
    }
}
