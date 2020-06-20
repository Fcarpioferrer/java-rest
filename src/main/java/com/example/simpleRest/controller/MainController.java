package com.example.simpleRest.controller;

import com.example.simpleRest.Models.People;
import com.example.simpleRest.Models.StartProject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {


    @Autowired
    ObjectMapper mapper;

    @GetMapping("/object")
    public ObjectNode getObject() {
        ObjectNode Obn = mapper.createObjectNode();
        Obn.put("name", "test name");
        return Obn;
    }

    @GetMapping(value = "/array", produces = "application/json")
    public ResponseEntity<Object> getArray() {
        int cant = 10;
        People[] peopleList = new People[cant];

        for (int i = 0; i < peopleList.length; i++) {
            People p = new People(("Name " + i), ("Last Name " + i), "3123123" + i);
            p.setIdentification(i * (12 + 1));
            peopleList[i] = p;
        }
        return new ResponseEntity(peopleList, HttpStatus.OK);
    }


    @GetMapping("/message")
    public String getMessage() {
        return new StartProject().getMessage();
    }

}
