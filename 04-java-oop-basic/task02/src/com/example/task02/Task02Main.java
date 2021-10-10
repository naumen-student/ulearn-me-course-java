package com.example.task02;

import java.sql.Time;

public class Task02Main {
    public static void main(String[] args) {

    }
}

class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        Hours = hours;
        Minutes = minutes;
        Seconds = seconds;
    }

    public void add(TimeSpan time) {
        Hours += time.getHours();
        Minutes += time.getMinutes();
        Seconds += time.getSeconds();
    }

    public void subtract(TimeSpan time) {
        Hours -= time.getHours();
        Minutes -= time.getMinutes();
        Seconds -= time.getSeconds();
    }

    public String toString() {
        return Hours + ":" + Minutes + ":" + Seconds;
    }

    public int getHours() {
        return Hours;
    }
    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public int getMinutes() {
        return Minutes;
    }
    public void setMinutes(int Minutes) {
        this.Minutes = Minutes;
    }

    public int getSeconds() {
        return Seconds;
    }
    public void setSeconds(int Seconds) {
        this.Seconds = Seconds;
    }
}
