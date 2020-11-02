package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public int getSeconds(){
        return seconds;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getHours(){
        return hours;
    }

    public void setSeconds(int value){
        this.seconds = value;
    }

    public void setMinutes(int value){
        this.minutes = value;
    }

    public void setHours(int value){
        this.hours = value;
    }

    public TimeSpan(int seconds,int minutes,int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    private void doRightFormat(){
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
    }

    public void add(TimeSpan time){
        hours += time.hours;
        minutes += time.hours;
        seconds += time.seconds;
        doRightFormat();
    }

    public void subtract(TimeSpan time){
        hours -= time.hours;
        minutes -= time.hours;
        seconds -= time.seconds;
        doRightFormat();
    }

    public String toString(){
        return String.format("Hours: %d, Minutes: %d, Seconds: %d", hours, minutes, seconds);
    }
}
