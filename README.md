[Screenshot_20250111_153106][def]
![pexels-geometric-photography-186685971-13271915](https://github.com/user-attachments/assets/a1323142-e50b-489f-99fa-f641e7a8c2e9)
c16c5d93-56fd-4489-ba15-503811ff3764@killercoda.com

hosting<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chatroom App</title>
    <link rel="stylesheet" href="styles.css">
    <script src="https://cdn.jsdelivr.net/npm/sockjs-client@1.5.1/dist/sockjs.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/stompjs@2.3.3/lib/stomp.min.js"></script>
</head>
<body>
    <div id="chat-app">
        <div class="sidebar">
            <h3>Rooms</h3>
            <ul id="roomList"></ul>
            <form id="createRoomForm">
                <input type="text" id="roomNameInput" placeholder="Create a new room" required>
                <button type="submit">Add Room</button>
            </form>
            <form id="deleteRoomForm">
                <input type="text" id="deleteRoomNameInput" placeholder="Delete a room" required>
                <button type="submit">Delete Room</button>
            </form>
        </div>
        <div class="chat-container">
            <div class="messages" id="messages"></div>
            <div class="chat-input">
                <input type="text" id="messageInput" placeholder="Type a message">
                <button onclick="sendMessage()">Send</button>
            </div>
        </div>
    </div>
    <script src="main.js"></script>
</body>
</html>https://nonebutfun-chat.firebaseapp.com/__/auth/handler

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.messaging.support.MessageHeaders;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.simp.stomp.StompCommand;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

package com.example.chatapp;




@SpringJUnitConfig
public class RoomControllerTest {

    private RoomController roomController;

    @BeforeEach
    public void setUp() {
        roomController = new RoomController();
    }

    @Test
    public void testCreateRoom() {
        List<String> rooms = roomController.createRoom("Sports");
`
`st<String> rooms = roomController.createRoom("General");
        assertEquals(4, rooms.size()); // No new room should be added
    }

    @Test
    public void testSendMessage() {
        ChatMessage message = new ChatMessage();
        message.setContent("Hello World");
        message.setSender("User1");

        ChatMessage response = roomController.sendMessage(message);
        assertEquals("Hello World", response.getContent());
        assertEquals("User1", response.getSender());
    }

    @Test
    public void testGetRooms() {
        List<String> rooms = roomController.getRooms();
        assertEquals(4, rooms.size());
        assertTrue(rooms.contains("General"));
        assertTrue(rooms.contains("Gaming"));
        assertTrue(rooms.contains("Movies"));
        assertTrue(rooms.contains("Random"));
    }
}









// ...existing code...});    document.getElementById('deleteRoomNameInput').value = '';    stompClient.send("/app/deleteRoom", {}, roomName);    const roomName = document.getElementById('deleteRoomNameInput').value;    event.preventDefault();document.getElementById('deleteRoomForm').addEventListener('submit', function(event) {


[def]: https://github.com/user-attachments/assets/a428910f-43d8-4b38-bf9e-ccef359b477f