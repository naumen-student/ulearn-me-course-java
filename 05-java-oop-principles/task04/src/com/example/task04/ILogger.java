package com.example.task04;

import com.example.task04.enums.LogLevel;

import java.util.HashMap;

public abstract class ILogger {
    private static final HashMap<String, Logger> AllLoggers = new HashMap();
    private final String name;
    private LogLevel level;

    public static Logger getLogger(String name) {
        if (AllLoggers.containsKey(name)) {
            return AllLoggers.get(name);
        } else {
            Logger current = new Logger(name);
            AllLoggers.put(name, current);
            return current;
        }
    }

    public ILogger(String name) {
        this.level = LogLevel.Debug;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public LogLevel getLevel() {
        return this.level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }
}
