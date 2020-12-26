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
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());

        String res = "";
        InputStream process = processBuilder.start().getInputStream();
        Scanner scanner = new Scanner(process);
        while (scanner.hasNextLine()) {
            String current = scanner.nextLine();
            if (current.startsWith("format.tags.title"))
                res = current.replace("format.tags.title=", "");
        }
        return res.substring(1, res.length() - 1);
    }
}
