package com.example.task04;

import java.io.*;

public class FileHandler extends Logger implements MessageHandler {
    private File file;
    protected String fileName;

    protected void setFile(String fileName) {
        this.fileName = fileName;
        fileName += ".log";
        File checkFile = new File(fileName);
        if (!checkFile.exists()) {
            try {
                checkFile.createNewFile();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (checkFile.canWrite()) {
            file = checkFile;
        } else {
            System.out.println("File is not writable");
        }
    }

    FileHandler(String loggerName, String fileName) {
        super(loggerName);
        setFile(fileName);
    }

    @Override
    public void log(Level loggingLevel, String message, Object... args) {
        try {
            if (loggingLevel.ordinal() >= this.loggingLevel.ordinal()) {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(super.messageBuild(loggingLevel, message, args));
                fileWriter.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

