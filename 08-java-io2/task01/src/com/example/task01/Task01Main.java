package com.example.task01;

import java.io.*;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Process process = processBuilder.start();
        Scanner scanner = new Scanner(process.getInputStream());
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.contains("format.tags.title")){
                return line.split("\"")[1];
            }
        }
        return "";
    }
}
