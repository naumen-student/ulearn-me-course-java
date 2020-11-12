package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(extractSoundName(new File("task01/src/main/resources/3724.mp3")));
    }

    public static String extractSoundName(File file) throws  InterruptedException {
        String[] parseNameFile = file.getName().split("/");
        String nameFile = parseNameFile[parseNameFile.length - 1];
        String pathToFile = ClassLoader.getSystemClassLoader().getResource(nameFile ).getPath().substring(1);
        ProcessBuilder processBuilder = new ProcessBuilder();
        File fileRunProcess = new File("C:\\ffmpeg\\bin");
        String pathToRunProcess = "C:\\ffmpeg\\bin\\ffprobe.exe";
        processBuilder.directory(fileRunProcess);
        String propertySound = "";
        String nameSound = "";
        try{
            processBuilder.command(pathToRunProcess,
                    "-of",
                    "flat",
                    "-show_format",
                    pathToFile);
            Process process = processBuilder.start();
            Scanner scanner  = new Scanner(process.getInputStream());
            while (scanner.hasNextLine()){
                propertySound = scanner.nextLine();
                if (propertySound.indexOf("format.tags.title") != -1){
                    nameSound = getTittleProperty(propertySound);
                    break;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return nameSound;
    }

    public static String getTittleProperty(String properties){
        return properties.split("format.tags.title")[1]
                .replace("=", "").replace("\"", "");
    }
}
