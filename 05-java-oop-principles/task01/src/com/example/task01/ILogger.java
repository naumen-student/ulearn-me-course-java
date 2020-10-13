package com.example.task01;

public abstract class ILogger {

    private  final  String name;
    private int level;

    public  ILogger(String name)
    {
        this.name=name;
    }

    public String getName ()
    {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level)
    {
        if (level>3)
            throw  new UnsupportedOperationException("level"+level+" is invalid");
        this.level=level;
    }

}
