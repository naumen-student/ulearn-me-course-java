package com.example.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Logger extends ILogger {
    private static final String format = "[%s] %s %s %s - %s";
    private static final HashMap<String,Logger> AllLoggers = new HashMap<>();

    public Logger(String name) {
        super(name);
    }

    public static Logger getLogger(String name)
    {
        if (AllLoggers.containsKey(name))
            return AllLoggers.get(name);

        Logger current = new Logger(name);
        AllLoggers.put(name,current);
        return current;
    }

    public void debug(String message)
    {
        formatAndPrint("DEBUG", message,0);
    }

    public void error(String message)
    {
        formatAndPrint("ERROR", message,3);
    }

    public void info(String message)
    {
        formatAndPrint("INFO", message,1);
    }

    public void warning(String message)
    {
        formatAndPrint("WARNING", message,2);
    }

    public void debug(String message, Object... args)
    {
        if (!(0<this.getLevel()))
            System.out.println(String.format(message, args));
    }

    public void error(String message, Object... args)
    {
        if (!(3<this.getLevel()))
            System.out.println(String.format(message, args));
    }

    public void info(String message, Object... args)
    {
        if (!(1<this.getLevel()))
            System.out.println(String.format(message, args));
    }

    public void warning(String message, Object... args)
    {
        if (!(2<this.getLevel()))
            System.out.println(String.format(message, args));
    }

    private String getDate()
    {
        return (LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.mm.dd")));
    }

    private String getTime()
    {
        return (LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
    }

    private  void formatAndPrint(String level, String message, int lvl)
    {
        String[] args = new String[]{level,getDate(),getTime(),this.getName(),message};
        if (!(lvl<this.getLevel()))
            System.out.print(String.format(format, args));
    }

    public void setLevel(int level){
        super.setLevel(level);
    }

    public int getLevel(){
        return super.getLevel();
    }

    public  String getName()
    {
        return super.getName();
    }

    public  void log(int logLvl, String message)
    {
        switchByLogLvlAndPrint(logLvl,message);
    }

    public  void log(int logLvl,String format, Object... args)
    {
        switchByLogLvlAndPrint(logLvl,String.format(format,args));
    }

    private  void switchByLogLvlAndPrint(int logLvl, String message)
    {
        switch (logLvl)
        {
            case 0:
                debug(message);
                break;
            case 1:
                info(message);
                break;
            case 2:
                warning(message);
                break;
            case 3:
                error(message);
                break;
            default:throw  new UnsupportedOperationException("Invalid LogLevel  "+logLvl);
        }
    }
}