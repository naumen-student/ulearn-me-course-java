package com.example.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));

    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(processBuilder.start().getInputStream()))){
            String res;
            while ((res = reader.readLine()) != null){
                if(res.contains("title")){
                    return res.split("\"")[1];
                }
            }
        } catch (IOException e){
            return null;
        }
        return null;
    }
}
