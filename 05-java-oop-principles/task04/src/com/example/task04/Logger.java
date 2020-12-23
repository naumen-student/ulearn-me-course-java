package com.example.task04;

import com.example.task04.enums.LogLevel;
import com.example.task04.handlers.MessageHandler;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Logger extends ILogger {
    private final ArrayList<MessageHandler> handlers = new ArrayList<MessageHandler>();

    public Logger(String name) {
        super(name);
    }

    public void debug(String message) {
        formatAndExecute(message, LogLevel.Debug);
    }

    public void error(String message) {
        formatAndExecute(message, LogLevel.Error);
    }

    public void info(String message) {
        formatAndExecute(message, LogLevel.Info);
    }

    public void warning(String message) {
        formatAndExecute(message, LogLevel.Warning);
    }

    public void log(LogLevel lvl, String message) {
        switchByLogLvlAndExecute(lvl, message);
    }

    public void debug(String message, Object... args) {formatAndExecute(String.format(message, args), LogLevel.Debug);}

    public void error(String message, Object... args) {formatAndExecute(String.format(message, args), LogLevel.Error);}

    public void info(String message, Object... args) {formatAndExecute(String.format(message, args), LogLevel.Info);}

    public void warning(String message, Object... args) {formatAndExecute(String.format(message, args), LogLevel.Warning);}

    public void log(LogLevel lvl, String format, Object... args)
    {switchByLogLvlAndExecute(lvl, String.format(format, args)); }

    public void addHandler(MessageHandler handler) {
        handlers.add(handler);
    }

    public void removeHandler(MessageHandler handler) {
        handlers.remove(handler);
    }

    public void removeAllHandlers() {
        handlers.clear();
    }

    private void formatAndExecute(String message, LogLevel lvl) {
        String[] args = new String[]{String.valueOf(lvl), getDate(), getTime(),getName(), message};
        String formatted = String.format("[%s] %s %s %s - %s", args);
        if (lvl.compareTo(getLevel()) >= 0)
            executeAll(formatted);
    }

    private void executeAll(String message)
    {
        for(MessageHandler handler:handlers)
            try {
                handler.execute(message);
            } catch (IOException var5) {
                var5.printStackTrace();
            }
    }

    private void switchByLogLvlAndExecute(LogLevel logLvl, String message) {
        if (logLvl == LogLevel.Debug) {
            formatAndExecute(message, LogLevel.Debug);
        } else if (logLvl == LogLevel.Info) {
            formatAndExecute(message, LogLevel.Info);
        } else if (logLvl == LogLevel.Warning) {
            formatAndExecute(message, LogLevel.Warning);
        } else if (logLvl == LogLevel.Error) {
            formatAndExecute(message, LogLevel.Error);
        }

    }

    private String getDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.mm.dd"));
    }

    private String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }
}
