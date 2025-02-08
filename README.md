c16c5d93-56fd-4489-ba15-503811ff3764@killercoda.com

# firebase init hosting

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
