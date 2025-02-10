https://github.com/firebase/snippets-android/blob/879beb277353217869503ee297b8aea9bc543b47/auth%2Fapp%2Fsrc%2Fmain%2Fjava%2Fcom%2Fgoogle%2Ffirebase%2Fquickstart%2Fauth%2FGoogleSignInActivity.java
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

<!DOCTYPE html>
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
</html>
<dependencies>
    <!-- Spring Boot Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot WebSocket -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-websocket</artifactId>
    </dependency>

    <!-- Spring Boot Messaging -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-messaging</artifactId>
    </dependency>

    <!-- Spring Boot DevTools (Optional) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
</dependencies>

your-username/chatroom-app.git# kyla.ai..py

﻿2025-02-07T06:54:14.9616154Z Current runner version: '2.322.0'
Operating System
Ubuntu
24.04.1
LTS
Runner Image
Image: ubuntu-24.04
Version: 20250202.1.0
Included Software: https://github.com/actions/runner-images/blob/ubuntu24/20250202.1/images/ubuntu/Ubuntu2404-Readme.md
Image Release: https://github.com/actions/runner-images/releases/tag/ubuntu24%2F20250202.1
Runner Image Provisioner
2.0.422.1
GITHUB_TOKEN Permissions
Actions: write
Attestations: write
Checks: write
Contents: write
Deployments: write
Discussions: write
Issues: write
Metadata: read
Packages: write
Pages: write
PullRequests: write
RepositoryProjects: write
SecurityEvents: write
Statuses: write
Secret source: Actions
Prepare workflow directory
Prepare all required actions
Getting action download info
Download immutable action package 'actions/checkout@v4'
Download immutable action package 'actions/setup-go@v5'
Download action repository 'golangci/golangci-lint-action@v4' (SHA:d6238b002a20823d52840fda27e2d4891c5952dc)
Complete job name: run (1.21.x)
c16c5d93-56fd-4489-ba15-503811ff3764@killercoda.com

# firebase init hosting<!DOCTYPE html>
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
        assertTrue(rooms.contains("Sports"));
    }

    @Test
    public void testCreateRoomAlreadyExists() {
        List<String> rooms = roomController.createRoom("General");
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
npm create cloudflare@latest -- hello-ai








// ...existing code...});    document.getElementById('deleteRoomNameInput').value = '';    stompClient.send("/app/deleteRoom", {}, roomName);    const roomName = document.getElementById('deleteRoomNameInput').value;    event.preventDefault();document.getElementById('deleteRoomForm').addEventListener('submit', function(event) {
https://github.com/Microsoft/vscode-remote-try-node) 