package com.qihui.sun.threadPerMessage;

public class Message {
    private final String value;

    public Message(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}