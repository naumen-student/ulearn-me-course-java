package com.example.task02;

public class TimeSpan {
    private int horse;
    private int minute;
    private int second;

    public TimeSpan(int horse, int minute, int second) {
        this.horse = horse;
        this.minute = minute;
        this.second = second;
    }

    public int getHorse() {
        return horse;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    void add(TimeSpan time) {
        horse += time.getHorse();
        minute += time.getMinute();
        second += time.getSecond();
    }

    void subtract(TimeSpan time) {
        horse -= time.getHorse();
        minute -= time.getMinute();
        second -= time.getSecond();
    }

    public String toString() {
        return String.format("%d : %d : %d", horse, minute, second);
    }
}
