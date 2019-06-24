package com.example.eventbusdemo.message;


/**
 * 定义消息事件类
 */

public class MessageEvent {

    private String message;

    public MessageEvent(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
