package org.testtask.rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.testtask.rest.facade.ServiceFacade;

@RestController
public class AppController {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private ServiceFacade serviceFacade;

    @PostMapping("/post")
    public String post(@RequestBody String body) throws JsonProcessingException {
        String[] array = objectMapper.readValue(body, String[].class);
        array = serviceFacade.getSortedModifiedArr(array);
        return objectMapper.writeValueAsString(array);
    }

    @GetMapping(value = "/get")
    public String get(@RequestParam("data") int data) {
        if (data < 1 || data > 12)
            return "INCORRECT INPUT DATA";
        return serviceFacade.getMonthDashedName(data);
    }
}
