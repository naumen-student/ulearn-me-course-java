package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    /* Обработчик - прокси, который может аккумулировать сообщения в памяти
     * и при необходимости (явном вызове метода или при достижении определенного объема)
     * отправлять их в проксируемый обработчик
     */

    private final ArrayList<String> accumulatedMssages = new ArrayList<>();
    private final MessageHandler handler;
    private final long size;

    public MemoryHandler(long size, MessageHandler handler) {
        this.handler = handler;
        this.size = size;
    }

    @Override
    public void log(String message) {
        accumulatedMssages.add(message);

        if (accumulatedMssages.size() >= size) {
            for (String savedMessage : accumulatedMssages) {
                handler.log(savedMessage);
            }
            accumulatedMssages.clear();
        }
    }

}
