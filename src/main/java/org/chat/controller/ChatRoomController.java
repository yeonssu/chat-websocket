package org.chat.controller;

import lombok.RequiredArgsConstructor;
import org.chat.entity.ChatRoom;
import org.chat.repository.ChatRoomRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat/rooms")
public class ChatRoomController {

    private final ChatRoomRepository chatRoomRepository;


    // 모든 채팅방 목록 반환
    @GetMapping
    @ResponseBody
    public List<ChatRoom> room() {
        return chatRoomRepository.findAllRoom();
    }


    // 채팅방 생성
    @PostMapping
    @ResponseBody
    public ChatRoom createRoom(@RequestParam String user) {
        return chatRoomRepository.createChatRoom(user);
    }


    // 특정 채팅방 조회
    @GetMapping("/{id}")
    @ResponseBody
    public ChatRoom roomInfo(@PathVariable String id) {
        return chatRoomRepository.findRoomById(id);
    }
}
