package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));

    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());

        Scanner scanner = new Scanner(processBuilder.start().getInputStream());

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("format.tags.title="))
                    return line.substring(19, line.length() - 1);
            }
        } finally {
            scanner.close();
        }
        return null;
    }
}
