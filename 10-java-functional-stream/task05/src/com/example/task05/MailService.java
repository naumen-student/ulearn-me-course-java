package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<InfoMessage<T>> {

    private Map<String, List<T>> mails = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new ArrayList<T>());
        }
    };
        public Map<String, List<T>> getMailBox() {
            return mails;
        }

        @Override
        public void accept(InfoMessage<T> iInfoMessage) {
            if (mails.containsKey(iInfoMessage.getTo())) {
                mails.get(iInfoMessage.getTo()).add(iInfoMessage.getContent());
            } else {
                List<T> contentList = new ArrayList<>();
                contentList.add(iInfoMessage.getContent());
                mails.put(iInfoMessage.getTo(), contentList);
            }
        }
    }

