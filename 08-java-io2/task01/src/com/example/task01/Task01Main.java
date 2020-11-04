package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main
{
    public static void main(String[] args) throws IOException, InterruptedException
    {

    }

    public static String extractSoundName(File file) throws IOException, InterruptedException
    {
        String result = "";
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scanner = new Scanner(processBuilder.start().getInputStream());
        while (scanner.hasNextLine())
        {
            String currentLine = scanner.nextLine();
            if (currentLine.contains("format.tags.title"))
            {
                result = currentLine.replace("format.tags.title=", "");
            }
        }
        return result.substring(1, result.length() - 1);
    }
}