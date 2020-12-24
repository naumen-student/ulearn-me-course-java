package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

        class Logger {
            private static final Map<String, Logger> loggersDictionary = new HashMap<>();
            private final String name;
            private Levels level;
            enum Levels{
                DEBUG,
                INFO,
                WARNING,
                ERROR
    }

            public Logger(String name){
                this.name = name;
            }
            public String getName(){
                return name;
            }

            public static Logger getLogger(String name){
                if(loggersDictionary.containsKey(name)){
                    return loggersDictionary.get(name);
                }
                loggersDictionary.put(name, new Logger(name));
                return loggersDictionary.get(name);
            }

            public void setLevel(Levels level){
                this.level = level;
            }

            public int getLevel(){
                return level.ordinal();
            }

            public void error(String message){
                log(level.ERROR, message);
            }

            public void info(String message){
                log(level.INFO, message);
            }

            public void warning(String message){
                log(level.WARNING, message);
            }

            public void debug(String message){
                log(level.DEBUG, message);
            }

            public void error(String template, Object... message){
                log(level.ERROR, template, message);
            }

            public void info(String template, Object... message){
                log(level.INFO, template, message);
            }

            public void warning(String template, Object... message){
                log(level.WARNING, template, message);
            }

            public void debug(String template, Object... message){
                log(level.DEBUG, template, message);
            }

            public void log(Levels level, String message){
                if( level != null && getLevel() > level.ordinal())
                    return;
                System.out.println("[" + level + "]" +
                        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(Calendar.getInstance().getTime()) +
                        message);
            }

            public void log(Levels level, String template, Object message){
                log(level, String.format(template, message));
            }
}
