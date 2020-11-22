package com.example.task04;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Logger
{
    private final static HashMap<String, Logger> loggerHashMap = new HashMap<>();
    private static ArrayList<MessageHandler> handlers = new ArrayList<>();

    public static Logger getLogger(String name)
    {
        if (loggerHashMap.containsKey(name))
        {
            return loggerHashMap.get(name);
        }
        return new Logger(name);
    }

    private final String name;
    private Level level = Level.DEBUG;

    public Logger(String name)
    {
        this.name = name;
        loggerHashMap.put(name, this);
    }

    enum Level
    {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public String getName()
    {
        return name;
    }

    public Level getLevel()
    {
        return level;
    }

    public void addHandler(MessageHandler... handlers)
    {
        Logger.handlers.addAll(Arrays.asList(handlers));
    }

    public void setLevel(Level level)
    {
        this.level = level;
    }

    private void log(Level level, String message)
    {
        for (MessageHandler handler : handlers)
        {
            if (level.compareTo(this.level) > -1)
            {
                handler.log(level, message);
            }
        }
    }

    private void log(Level level, String pattern, Object... args)
    {
        String message = String.format(pattern, args);
        for (MessageHandler handler : handlers)
        {
            handler.log(level, message);
        }
    }

    public void debug(String message)
    {
        log(Level.DEBUG, message);
    }

    public void debug(String pattern, Object... args)
    {
        log(Level.DEBUG, pattern, args);
    }

    public void info(String message)
    {
        log(Level.INFO, message);
    }

    public void info(String pattern, Object... args)
    {
        log(Level.INFO, pattern, args);
    }
    public void warning(String message)
    {
        log(Level.WARNING, message);
    }

    public void warning(String pattern, Object... args)
    {
        log(Level.WARNING, pattern, args);
    }

    public void error(String message)
    {
        log(Level.ERROR, message);
    }

    public void error(String pattern, Object... args)
    {
        log(Level.ERROR, pattern, args);
    }
}