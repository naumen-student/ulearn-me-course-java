package com.example.task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) throws IOException{
        System.out.println(extractSoundName(new File("08-java-io2/task01/src/main/resources/3726.mp3")));
    }

    public static String extractSoundName(File file) throws IOException {
        String res = "";
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        Scanner scanner = new Scanner(processBuilder.start().getErrorStream());
        while (scanner.hasNext()) {
            String curLine = scanner.nextLine();
            if (curLine.startsWith("format.tags.title"))
                res = curLine.replace("format.tags.title=", "");
        }
        return res.substring(1, res.length() - 1);
    }
}
