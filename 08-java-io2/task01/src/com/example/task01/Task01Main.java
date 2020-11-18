package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
        */
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scanner = new Scanner(processBuilder.start().getInputStream());
        String name = "";
        while (scanner.hasNextLine()) {
            String thisLine = scanner.nextLine();
            if (thisLine.startsWith("format.tags.title")) {
                name = thisLine.replace("format.tags.title=", "");
            }
        }
        name = name.substring(1, name.length() - 1);
        return name;
    }
}
