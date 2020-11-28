package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder procBuild = new ProcessBuilder();
        procBuild.command("ffprobe", "-v error", "-of flat", "-show_format", file.getAbsolutePath());
        InputStream input = procBuild.start().getInputStream();
        Scanner sc = new Scanner(input);
        Scanner scan = new Scanner(input);
        while (scan.hasNextLine()) {
            String currentLine = scan.nextLine();
            if (currentLine.startsWith("format.tags.title")) {
                return currentLine.split("\"")[1];
            }
        }
        return null;
    }
}
