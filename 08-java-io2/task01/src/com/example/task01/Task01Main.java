package com.example.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect;
import java.util.logging.Logger;

public class Task01Main {

    private static Logger log = Logger.getLogger(Task01Main.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(extractSoundName(new File("C:\\Users\\User\\Ulearn\\ulearn-me-course-java\\08-java-io2\\task01\\src\\main\\resources\\3726.mp3")));
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath())
                .redirectOutput(Redirect.PIPE);
        Process process = processBuilder.start();
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))){
            for (Object s: reader.lines().toArray()) {
                log.info(s.toString());
                if(s.toString().startsWith("format.tags.title"))
                    return s.toString().replace("format.tags.title=", "");
            }
        }
        return null;
    }
}
