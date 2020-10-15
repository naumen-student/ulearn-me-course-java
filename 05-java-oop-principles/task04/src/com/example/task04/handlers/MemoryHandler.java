package com.example.task04.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemoryHandler implements MessageHandler {

    private final int maxLength;
    private final List<String> messagesBuffer = new ArrayList();
    private int commonLength;
    private final MessageHandler next;

    public MemoryHandler(MessageHandler nextHandler, int minLengthOfWrittenMessage) {
        this.maxLength = minLengthOfWrittenMessage;
        this.next = nextHandler;
    }

    public void execute(String message) throws IOException {
        this.commonLength += message.length() + 1;
        this.messagesBuffer.add(message);
        if (this.commonLength >= this.maxLength) {
            String[] v = this.messagesBuffer.toArray(new String[this.messagesBuffer.size()]);
            this.next.execute(String.join("\n", v));
            this.commonLength = 0;
            this.messagesBuffer.clear();
        }

    }
}