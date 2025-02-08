package com.example.chatapp;

public class ChatMessage {
    private String sender;
    private String content;
    private String room;

    public ChatMessage() {
    }

    public ChatMessage(String sender, String content, String room) {
        this.sender = sender;
        this.content = content;
        this.room = room;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
