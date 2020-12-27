package com.example.task01;

import java.io.*;
import java.util.Scanner;

public class Task01Main {

        public static void main(String[] args) throws IOException {
            System.out.println(extractSoundName(new File("08-java-io2/task01/src/main/resources/3727.mp3")));
        }

            public static String extractSoundName(File file) throws IOException {
                ProcessBuilder processBuilder = new ProcessBuilder();
                processBuilder.command("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
                Scanner scanner = new Scanner(processBuilder.start().getInputStream());
                while(scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.startsWith("format.tags.title"))
                        return line.substring(19, line.length() - 1);
                }
                return null;
            }
        }