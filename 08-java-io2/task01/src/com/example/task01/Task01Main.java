package com.example.task01;

import java.io.*;
import java.util.Scanner;

public class Task01Main {
    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        String result = "";
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scanner = new Scanner(processBuilder.start().getInputStream());
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            if (currentLine.startsWith("format.tags.title"))
                result = currentLine.replace("format.tags.title=", "");
        }
        return result.substring(1, result.length() - 1);
    }
}
