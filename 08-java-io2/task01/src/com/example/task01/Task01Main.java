package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scanner = new Scanner(builder.start().getInputStream());
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("format.tags.title")) {
                return line.split("\"")[1];
            }
        }
        return null;
    }
}
