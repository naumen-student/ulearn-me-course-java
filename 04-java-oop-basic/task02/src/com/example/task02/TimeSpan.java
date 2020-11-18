package com.example.task02;

public class TimeSpan {
    private long totalSeconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        totalSeconds = hours * 3600 + minutes * 60 + seconds;
    }

    public void add(TimeSpan time) {
        totalSeconds += time.totalSeconds;
    }

    public void subtract(TimeSpan time) {
        totalSeconds -= time.totalSeconds;
    }

    @Override
    public String toString() {
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds - hours * 3600) / 60;
        long seconds = totalSeconds - hours * 3600 - minutes * 60;
        return "(" + hours + " hours, " + minutes + " minutes, " + seconds + " seconds)";
    }

    public long getTotalSeconds() {
        return totalSeconds;
    }

    public void setTotalSeconds(long totalSeconds) {
        this.totalSeconds = totalSeconds;
    }
}
