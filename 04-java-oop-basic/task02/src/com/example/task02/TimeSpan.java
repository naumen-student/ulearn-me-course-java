package com.example.task02;

public class TimeSpan {
    private int hour, minute, second;

    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(int hour){
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getMinute(int minute){
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public int getSecond(int second){
        return second;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void add(TimeSpan time){
        hour += time.hour;
        minute += time.minute;
        second += time.second;
    }
    public void subtract(TimeSpan time){
        hour -= time.hour;
        minute -= time.minute;
        second -= time.second;
    }
    public String toString(){
        return String.format("%d:%d:%d", hour, minute, second);
    }
}

