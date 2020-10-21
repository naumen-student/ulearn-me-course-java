package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public String toString(){
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    void add(TimeSpan time){
        doArithmetic(time, +1);
    }

    void subtract(TimeSpan time){
        doArithmetic(time, -1);
    }

    private void doArithmetic(TimeSpan time, int sign){
        hours+=sign * time.hours;
        minutes+=sign * time.minutes;
        seconds+=sign * time.seconds;
        normalize();
    }

    private void normalize() {
        int tmp;
        if (seconds > 59){
            tmp = seconds / 60;
            minutes+=tmp;
            seconds-=tmp * 60;
        }
        if (seconds < 0){
            tmp = (int) Math.ceil((double) -seconds / 60);
            minutes-=tmp;
            seconds+=tmp * 60;
        }
        if (minutes > 59){
            tmp =minutes / 60;
            hours+=tmp;
            minutes-=tmp * 60;
        }
        if (minutes < 0){
            tmp = (int) Math.ceil((double) -minutes / 60);
            hours-=tmp;
            minutes+=tmp * 60;
        }
    }

}
