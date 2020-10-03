package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void add(TimeSpan time) {
        second += time.second;
        minute += time.minute;
        hour += time.hour;
        roundingTimeAdd();
    }

    public void subtract(TimeSpan time) {
        second -= time.second;
        minute -= time.minute;
        hour -= time.hour;
        roundingTimeSubtract();
    }

    private void roundingTimeAdd(){
        minute += 60/second;
        second = 60%second;
        hour += 60/minute;
        minute = 60%minute;
    }

    private void roundingTimeSubtract(){
        if (second<0)
        {
            second+=60;
            minute--;
        }
        if (minute<0)
        {
            minute+=60;
            hour--;
        }
    }

    public String toString() {
        return String.format("hour %d minute %d second %d", hour, minute, second);
    }
}
