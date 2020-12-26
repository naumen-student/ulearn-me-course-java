package com.example.task02;
class TimeSpan{
    private int hours;
    private int minute;
    private int seconds;

    public int getHours(){
        return hours;
    }

    public void setHours(int value){
        hours = value;
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int value){
        minute = value < 60 && value >= 0 ? value : 0;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int value){
        seconds = value < 60 && value >= 0 ? value : 0;
    }

    public TimeSpan(int hours, int minute, int seconds){
        this.hours = hours;
        if(minute < 60 && minute >= 0)
            this.minute = minute;
        if(seconds < 60 && seconds >= 0)
            this.seconds = seconds;
    }

    public void add(TimeSpan time){
        TimeSpan temp = toTimeSpan(toSeconds(time) + toSeconds(this));
        hours = temp.hours;
        minute = temp.minute;
        seconds = temp.seconds;
    }

    public void subtract(TimeSpan time){
        int firstTimeToSeconds = toSeconds(this);
        int secondTimeToSeconds = toSeconds(time);
        if(firstTimeToSeconds > secondTimeToSeconds)
            Subtraction(firstTimeToSeconds - secondTimeToSeconds);
        if (firstTimeToSeconds < secondTimeToSeconds)
            Subtraction(secondTimeToSeconds - firstTimeToSeconds);
        else
        {
            hours = 0;
            minute = 0;
            seconds = 0;
        }
    }

    private void Subtraction(int seconds){
        TimeSpan temp = toTimeSpan(seconds);
        hours = temp.hours;
        minute = temp.minute;
        this.seconds = temp.seconds;
    }

    private int toSeconds(TimeSpan timeSpan){
        return (timeSpan.hours * 60 + timeSpan.minute) * 60 + timeSpan.seconds;
    }

    private TimeSpan toTimeSpan(int seconds){
        return new TimeSpan(seconds / 3600, (seconds % 3600) / 60, (seconds % 3600)% 60);
    }

    public String toString(){
        return hours + ":" + minute + ":" + seconds;
    }
}


public class Task02Main {
    public static void main(String[] args) {

    }
}
