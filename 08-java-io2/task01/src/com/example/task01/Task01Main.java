package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {

    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder procB = new ProcessBuilder();
        String res = "";
        procB.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scan = new Scanner(procB.start().getInputStream());

        while (scan.hasNextLine()) {
            String currentString = scan.nextLine();

            if (currentString.startsWith("format.tags.title")) {
                return currentString.split("\"")[1];
            }

        }
        return res;
    }
}
