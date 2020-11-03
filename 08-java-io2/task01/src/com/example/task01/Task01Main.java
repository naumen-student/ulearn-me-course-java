package com.example.task01;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task01Main{

    public static String extractSoundName(File file) throws IOException, InterruptedException{
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format");
        processBuilder.directory(file);
        try (Scanner scanner = new Scanner(processBuilder.start().getInputStream())) {
            Pattern pattern = Pattern.compile("format.tags.title=\"*\"");
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);
                if ( matcher.find() )
                    return matcher.group();
            }
        }
        return null;
    }
}
