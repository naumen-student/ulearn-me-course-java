package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class RotatiionFileHandler implements MessageHandler {

    private int Interval;
    private Timer timer;

    public void setInterval(int interval) {
        Interval = interval;
    }

    public void stopSendMessage(){
        timer.cancel();
    }

    @Override
    public void outMessage(String message) {
        if(Interval == 0){
            System.out.println("Set interval!!!");
            return;
        }
        timer = new Timer();
        int number = 1;
        timer.scheduleAtFixedRate(new TaskMessage(message, number++), 0, Interval);
    }
    class TaskMessage extends TimerTask {

        private  String message;
        private int number;

        public TaskMessage(String message, int number){
            this.message = message;
            this.number = number;
        }

        @Override
        public void run() {
            try(FileWriter writer = new FileWriter("text" + number + ".txt", false)){
                writer.write(message);
                writer.flush();
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
