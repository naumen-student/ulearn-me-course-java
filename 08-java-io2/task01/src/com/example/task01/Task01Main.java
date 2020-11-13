package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println(extractSoundName(new File("08-java-io2/task01/src/main/resources/3727.mp3")));
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {

        ProcessBuilder processBuilder = new ProcessBuilder("ffprobe", "-v", "error", "-of", "flat", "-show_format" , file.getAbsolutePath());

        Scanner scanner = new Scanner(processBuilder.start().getInputStream());
        while (scanner.hasNextLine()) {
            String currLine = scanner.nextLine();
            if (currLine.startsWith("format.tags.title"))
                return currLine.substring(currLine.indexOf('"') + 1, currLine.lastIndexOf('"'));
        }

        return null;
    }
}
