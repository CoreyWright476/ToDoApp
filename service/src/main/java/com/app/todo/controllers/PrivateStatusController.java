package com.app.todo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateStatusController {

    @GetMapping("/status")
    public ResponseEntity<String> privateStatus() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
