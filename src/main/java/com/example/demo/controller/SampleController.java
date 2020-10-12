package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/in")
public class SampleController {

    @GetMapping(produces = "application/json")
    public String msg(){
        return "OK";
    }
}
