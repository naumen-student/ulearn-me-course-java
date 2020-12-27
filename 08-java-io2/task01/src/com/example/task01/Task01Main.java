package com.example.task01;

import java.io.File;
import java.io.IOException;
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
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getName())
                .directory(file.getParentFile());

        StringBuilder res = new StringBuilder();
        Process process = processBuilder.start();
        Scanner scanner = new Scanner(process.getInputStream());
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.startsWith("format.tags.title")){
                String split = line.split("=")[1];
                res.append(split, 1, split.length() - 1);
            }
        }
        return res.toString();
    }
}
