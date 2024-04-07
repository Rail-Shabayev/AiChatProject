package org.rail.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.rail.model.Request;
import org.rail.model.Response;
import org.rail.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController implements ChatControllerSpec {
    private final ChatService chatService;


    @PostMapping
    public Response postRequest(@RequestBody Request request) throws JsonProcessingException {
        return chatService.makeRequest(request);
    }

}
