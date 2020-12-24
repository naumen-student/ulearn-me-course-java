package com.example.task01;

import java.io.File;
import java.io.IOException;

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
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());

        try (java.util.Scanner scanner = new java.util.Scanner(processBuilder.start().getInputStream())){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.contains("format.tags.title=")){
                    return line.split("\"")[1];
                }
            }
        }
        return null;
    }
}
