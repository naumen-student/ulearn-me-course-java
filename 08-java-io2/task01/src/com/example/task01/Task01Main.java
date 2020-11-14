package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(extractSoundName(new File("src/main/resources/3727.mp3")));
    }

    public static String extractSoundName(File file) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scanner = new Scanner(processBuilder.start().getInputStream());
        return getName(scanner);
    }

        private static String getName(Scanner scanner) {
            while ( scanner.hasNextLine()) {
                final String currentLine = scanner.nextLine();
                if (currentLine.contains("format.tags.title")) {
                    return currentLine
                            .replace("format.tags.title", "")
                            .replace("\"", "")
                            .replace("=", "");
                }
        }
        return null;
    }
}