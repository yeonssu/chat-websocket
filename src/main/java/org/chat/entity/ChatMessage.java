package org.chat.entity;

import lombok.Data;

@Data
public class ChatMessage {

    private MessageType type;
    private String roomId;
    private String sender;
    private String message;

    public enum MessageType {
        ENTER, TALK, EXIT, MATCH, MATCH_REQUEST;
    }
}
