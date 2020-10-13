package com.example.task04;

import java.util.Timer;
import java.util.TimerTask;

public class RotationFileHandler extends FileHandler {
    String defaultFileName;
    int rotation;
    int round;

    class MTimer extends TimerTask {

        @Override
        public void run() {
            try {
                round++;
                fileName = defaultFileName + round;
                setFile(fileName);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    RotationFileHandler(String loggerName, String defaultFileName, int rotationInMillis) {
        super(loggerName, defaultFileName);
        rotation = rotationInMillis;
        this.defaultFileName = defaultFileName;
        round = 0;
        TimerTask timerTask = new MTimer();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, rotationInMillis);
    }

}
