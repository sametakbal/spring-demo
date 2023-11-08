package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/message/{message}")
    public String message(@PathVariable String message) {
        return "This is a message from the controller: " + message;
    }

    @GetMapping("/message/{message}/name/{name}")
    public String message(@PathVariable String message, @PathVariable String name) {
        return "This is a message from the controller: " + message + " from " + name;
    }

    @GetMapping("/print/{count}")
    public String print(@PathVariable int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= count; i++) {
            sb.append(i).append(',');
        }
        return sb.substring(0, sb.length() - 1);
    }
}
