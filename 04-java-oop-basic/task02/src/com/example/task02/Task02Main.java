package com.example.task02;

        class TimeSpan {
            private int hours;
            private int minutes;
            private int seconds;

            public TimeSpan(int hours, int minutes, int seconds) {
                this.hours = hours;
                this.minutes = minutes;
                this.seconds = seconds;
            }

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            void getNormalizeTime() {
                minutes += seconds / 60;
                seconds = seconds % 60;
                hours += minutes / 60;
                minutes = minutes % 60;
            }

            void add(TimeSpan time) {
                hours += time.hours;
                minutes += time.minutes;
                seconds += time.seconds;
                getNormalizeTime();
            }

            void subtract(TimeSpan time) {
                hours -= time.hours;
                minutes -= time.minutes;
                seconds -= time.seconds;
                getNormalizeTime();
            }

            public String toString() {
                return String.format("h: %d, m: %d, s: %d", hours, minutes, seconds);
            }
        }