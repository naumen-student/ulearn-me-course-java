package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {

    public static void main(String[] args){
        System.out.println(extractSoundName(new File("/home/user/Рабочий стол/ul/3724.mp3")));
    }

    public static String extractSoundName(File file){
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath())
                .redirectOutput(ProcessBuilder.Redirect.PIPE);
        try(Scanner scanner = new Scanner(processBuilder.start().getInputStream())){
            while(scanner.hasNext()){
                String data = scanner.nextLine();
                if(data.startsWith("format.tags.title"))
                    return data.split("\"")[1];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}