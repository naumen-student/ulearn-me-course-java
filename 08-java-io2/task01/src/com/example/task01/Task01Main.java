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
        while (scanner.hasNextLine()){
            String currentStr = scanner.nextLine();
            if(currentStr.contains("format.tags.title")){
                return currentStr.split("\"")[1];
            }
        }
        return null;
    }
}
