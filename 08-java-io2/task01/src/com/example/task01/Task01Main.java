package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Task01Main {
    public static void main(String[] args) throws IOException{
        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
    }

    public static String extractSoundName(File file) throws IOException {
        ProcessBuilder procBuilder = new ProcessBuilder();
        procBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format",
                file.getAbsolutePath());

        Process process = procBuilder.start();

        try (Scanner scanner = new Scanner(process.getInputStream())) {
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (nextLine.contains("format.tags.title"))
                    return nextLine.split("\"")[1];
            }
        }
        return null;
    }
}
