package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {

    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        String res = "";

        Scanner sc = new Scanner(processBuilder.start().getInputStream());
        while (sc.hasNextLine()) {
            String curr = sc.nextLine();
            if (curr.startsWith("format.tags.title")) return curr.split("\"")[1];
        }
        return null;
    }
}
