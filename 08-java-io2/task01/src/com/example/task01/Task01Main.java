package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static String extractSoundName(File file) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());

        Scanner scanner = new Scanner(processBuilder.start().getInputStream());
        while (scanner.hasNextLine()) {
            String current = scanner.nextLine();
            if (current.contains("format.tags.title"))
                return current.subSequence(19, current.length() - 1).toString();
        }
        return null;
    }
}
