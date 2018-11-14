package com.example.springboothttp2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    @RequestMapping("/http2")
    public String getString(){
        return "visit http2 success !!!";
    }
}
