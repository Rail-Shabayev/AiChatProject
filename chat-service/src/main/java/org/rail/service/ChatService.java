package org.rail.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rail.model.Request;
import org.rail.model.Response;
import org.rail.repository.RequestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final RequestRepository requestRepository;
    private final RestClient restClient;
    private final ObjectMapper objectMapper;

    public Response makeRequest(Request request) throws JsonProcessingException {
        //Repository saving
        String body = objectMapper.writeValueAsString(request);
        System.out.println(body);
        ResponseEntity<Response> response = restClient
                .post()
                .body(body)
                .retrieve()
                .toEntity(Response.class);
        System.out.println(response);
        return response.getBody();
    }
}
