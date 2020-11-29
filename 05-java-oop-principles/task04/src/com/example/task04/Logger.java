package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.*;

public class Logger {

    private String name;
    private static List<Logger> logLogger = new ArrayList();
    private Level level = Level.DEBUG;
    private ConsoleHandler consoleHandler;
    private FileHandler fileHandler;
    private MemoryHandler memoryHandler;
    private RotationFileHandler rotationFileHandler;

    public Logger(String name) {
        this.name = name;
        consoleHandler = new ConsoleHandler(this);
        fileHandler = new FileHandler(this);
        rotationFileHandler = new RotationFileHandler(this);
        memoryHandler = new MemoryHandler(this);
    }

    public void log(Level level, String message, int handlerVariant, boolean memoryHandlerON) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, formatForDateNow.format(dateNow), name, message);
         if (memoryHandlerON){

         }else {
             switch (handlerVariant){
                 case 0:
                     consoleHandler.log(result);
                     break;

                 case 1:
                     fileHandler.log(result);
                     break;
                 case 2:
                     rotationFileHandler.log(result);
                     break;
                 default:
                     memoryHandler.log(result);
                     break;
             }
         }
    }

    public static Logger getLogger(String name) {
        boolean flag = false;
        Logger log = null;
        for (Logger logger : logLogger) {
            if (logger.getName().equals(name)) {
                log = logger;
                flag = true;
                break;
            }
        }
        if (!flag) {
            log = new Logger(name);
            logLogger.add(log);
        }
        return log;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}