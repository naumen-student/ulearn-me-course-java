package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) {
    }

    public static String extractSoundName(File file) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scanner = new Scanner(processBuilder.start().getInputStream());
        while (scanner.hasNextLine()){
            String nextLine = scanner.nextLine();
            if (nextLine.contains("format.tags.title"))
                return nextLine.split("\"")[1];
        }
        return "";
    }
}