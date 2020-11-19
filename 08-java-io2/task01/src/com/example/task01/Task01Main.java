package com.example.task01;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task01Main {
    private static String title;
    public static void main(String[] args) throws IOException, InterruptedException {
//        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
    }
    public static String extractSoundName(File file) throws IOException, InterruptedException {
        new BufferedReader(
                new InputStreamReader(
                        new ProcessBuilder()
                                .command("C:\\ffmpeg\\bin\\ffmpeg", "-i", file.getAbsoluteFile().toString())
                                .command("ffmpeg", "-i", file.getAbsoluteFile().toString())
                                .start()
                                .getErrorStream()))
                .lines()
                .forEach(Task01Main::getTitle);
        return title;
    }
    private static void getTitle(String line) {
        if (line.indexOf("title") > 0) {
            int indexOfTitle = line.indexOf(":") + 2;
            title = line.substring(indexOfTitle);
        }
    }
}
