package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }
    public class TimeSpan {
        private int seconds, minutes, hours;
        void add(TimeSpan time) {
            this.seconds += time.seconds;
            this.minutes += time.minutes;
            this.hours += time.hours;
        }

        void subtract(TimeSpan time) {
            this.seconds -= time.seconds;
            this.minutes -= time.minutes;
            this.hours -= time.hours;
        }

        public String toString() {
            return String.format("%d, %d, %d", hours, minutes, seconds);
        }

        public int getSeconds() {
            return seconds;
        }

        public int getMinutes() {
            return minutes;
        }

        public int getHours() {
            return hours;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }

        public void setMinutes(int minutes) {
            this.seconds = minutes;
        }

        public void setHours(int hours) {
            this.seconds = hours;
        }

        public TimeSpan(int seconds, int minutes, int hours) {
            this.seconds = seconds;
            this.minutes = minutes;
            this.hours = hours;
        }
    }
}
