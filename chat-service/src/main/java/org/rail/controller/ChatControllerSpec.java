package org.rail.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.rail.model.Request;
import org.rail.model.Response;

@Tag(name = "Chat APIs", description = "Chat controller")
public interface ChatControllerSpec {

    @Operation(summary = "Post text prompt to generate response")
    public Response postRequest(Request request) throws JsonProcessingException;

}
