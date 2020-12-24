package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.io.BufferedReader;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));

    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        // your implementation here
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
