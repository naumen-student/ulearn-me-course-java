package com.example.task04.handlers;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class RotationFileHandler extends FileHandler {

    private final Timer timer = new Timer();
    private int count;

    public RotationFileHandler(String path, int rotationInMillis) throws IOException {
        super(path);
        this.timer.scheduleAtFixedRate(new RotationFileHandler.RotationTask(), 0L, rotationInMillis);
    }

    public void setRotation(int rotationInMillis) {
        this.timer.cancel();
        this.timer.scheduleAtFixedRate(new RotationFileHandler.RotationTask(), 0L, rotationInMillis);
    }

    public void execute(String message) throws IOException {
        super.execute(message);
    }

            private class RotationTask extends TimerTask
            {

                public void run()
                {
                    String[] parsed = RotationFileHandler.this.getPath().split(".");
                    parsed[parsed.length - 2] = parsed[parsed.length - 2] + RotationFileHandler.this.count;
                    RotationFileHandler.this.count++;
                    RotationFileHandler.this.setPath(String.join(".", parsed));
                }
            }
}
