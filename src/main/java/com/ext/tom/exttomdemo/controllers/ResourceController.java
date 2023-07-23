package com.ext.tom.exttomdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/resources")
public class ResourceController {

    @GetMapping
    String getResource(){
        return "I am get mapping";
    }
}
