package com.example.chatapp;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomController {

    private final List<String> rooms = new ArrayList<>();

    public RoomController() {
        // Default rooms
        rooms.add("General");
        rooms.add("Gaming");
        rooms.add("Movies");
        rooms.add("Random");
    }

    // Handle room creation requests
    @MessageMapping("/createRoom")
    @SendTo("/topic/rooms")
    public List<String> createRoom(String roomName) {
        if (!rooms.contains(roomName)) {
            rooms.add(roomName);
        }
        return rooms;
    }

    // Handle new messages
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Broadcasts the message to all users
    }

    // Returns the list of rooms when requested
    @MessageMapping("/getRooms")
    @SendTo("/topic/rooms")
    public List<String> getRooms() {
        return rooms;
    }
}