package com.example.task01;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Task01Main{
    public static String extractSoundName(File file) throws IOException, InterruptedException{
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format");
        processBuilder.directory(file);
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        try (Scanner scanner = new Scanner(processBuilder.start().getInputStream())) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if ( line.contains("format.tags.title=") )
                    return line.substring(19, line.length() - 1);
            }
        }
        return null;
    }
}