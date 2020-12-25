package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(extractSoundName(new File("08-java-io2/task01/src/main/resources/3727.mp3")));
    }

    public static String extractSoundName(File file) throws IOException {
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