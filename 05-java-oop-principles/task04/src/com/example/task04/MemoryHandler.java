package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class MemoryHandler extends Logger implements MessageHandler {
    private final int limitedSize;
    private ArrayList<String> messages = new ArrayList<>();
    private ArrayList<Level> levels = new ArrayList<>();
    private boolean isInFileWriting;
    private String fileName;

    MemoryHandler(String loggerName) {
        super(loggerName);
        limitedSize = 0;
    }

    MemoryHandler(String loggerName, int limitedSize) {
        super(loggerName);
        this.limitedSize = limitedSize;
        isInFileWriting = false;
    }

    MemoryHandler(String loggerName, int limitedSize, String fileName) {
        super(loggerName);
        this.limitedSize = limitedSize;
        isInFileWriting = true;
        this.fileName = fileName;
    }

    @Override
    public void log(Level loggingLevel, String message, Object... args) {
        messages.add(messageBuild(loggingLevel, message, args));
        levels.add(loggingLevel);
        if (messages.size() == limitedSize) {
            if (isInFileWriting) {
                for (int i = 0; i < messages.size(); i++) {
                    writeMessagesInFile(fileName);
                }
            } else {
                for (int i = 0; i < messages.size(); i++) {
                    writeMessagesInConsole();
                }
            }
        }
    }

    public void writeMessagesInConsole() {
        if (messages.size() == 0) {
            System.out.println("No messages");
        } else {
            for (int i = 0; i < messages.size(); i++) {
                if(levels.get(i).ordinal() >= loggingLevel.ordinal()) {
                    System.out.print(messages.get(i));
                }
            }
            messages = new ArrayList<>();
            levels = new ArrayList<>();
        }
    }

    public void writeMessagesInFile(String fileName)
    {
        if (messages.size() == 0) {
            System.out.println("No messages");
        }
        else {
            fileName += ".log";
            File file = new File(fileName);
            if(!file.exists()) {
                try {
                    file.createNewFile();
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
            if (file.canWrite()) {
                try {
                    FileWriter fileWriter = new FileWriter(new File(fileName), true);
                    for (int i = 0; i < messages.size(); i++) {
                        if (levels.get(i).ordinal() >= loggingLevel.ordinal()) {
                            fileWriter.write(messages.get(i));
                        }
                    }
                    fileWriter.close();
                    messages = new ArrayList<>();
                    levels = new ArrayList<>();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else {
                System.out.println("File is not writable");
            }
        }
    }

}
