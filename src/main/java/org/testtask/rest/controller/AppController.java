package org.testtask.rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.testtask.rest.dto.InputStringCollection;
import org.testtask.rest.service.StringService;

@RestController
public class AppController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StringService stringService;

    @PostMapping("/post")
    public String post (@RequestBody String body) throws JsonProcessingException {
        InputStringCollection inputStringCollection = objectMapper.readValue(body, InputStringCollection.class);
        return objectMapper.writeValueAsString(stringService.sort(inputStringCollection.getStrings()));
    }
}
