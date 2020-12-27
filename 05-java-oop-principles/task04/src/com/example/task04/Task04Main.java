package com.example.task04;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

public class Logger
{

    private final String name;
    private static final Hashtable<String, Logger> loggers = new Hashtable<>();
    private static ArrayList<MessageHandler> handlers = new ArrayList<>();
    private logLevel level;

    enum logLevel
    {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private Logger(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public static Logger getLogger(String name)
    {
        if (!loggers.containsKey(name)) {
            loggers.put(name, new Logger(name));
        }
        return new Logger(name);
    }

    public void setLevel(logLevel level)
    {
        this.level = level;
    }

    public logLevel getLevel()
    {
        return this.level;
    }

    public void debug(String message)
    {
        this.log(logLevel.DEBUG, message);
    }

    public void debug(String format, Object... params)
    {
        this.log(logLevel.DEBUG, format, params);
    }

    public void info(String message)
    {
        this.log(logLevel.INFO, message);
    }

    public void info(String format, Object... params)
    {
        this.log(logLevel.INFO, format, params);
    }

    public void warning(String message)
    {
        this.log(logLevel.WARNING, message);
    }

    public void warning(String format, Object... params)
    {
        this.log(logLevel.WARNING, format, params);
    }

    public void error(String message)
    {
        this.log(logLevel.ERROR, message);
    }

    public void error(String format, Object... params)
    {
        this.log(logLevel.ERROR, format, params);
    }

    public void addHandler(MessageHandler handler)
    {
        handlers.add(handler);
    }

    public void log(logLevel level, String message)
    {
        if (level.ordinal() >= getLevel().ordinal())
        {
            Date date = new Date();
            DateFormat formattedDate = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
            String resultMessage = String.format("[{0}] {1} {2} - {3}%n",
                    level,
                    formattedDate,
                    this.name,
                    message);
            for (MessageHandler handler: handlers)
            {
                handler.logMes(resultMessage);
            }
        }
    }

    public void log(logLevel level, String format, Object... params)
    {
        log(level, String.format(format, params));
    }
}