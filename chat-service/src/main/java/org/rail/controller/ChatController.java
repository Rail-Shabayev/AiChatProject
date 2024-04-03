package org.rail.controller;

import org.rail.model.Request;
import org.rail.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController implements ChatControllerSpec {
    @Override
    @GetMapping
    public Response postRequest(@RequestBody Request request) {
        return null;
    }
}
