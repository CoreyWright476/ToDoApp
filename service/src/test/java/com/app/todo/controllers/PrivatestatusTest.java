package com.app.todo.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class PrivatestatusTest {
    PrivateStatusController privateStatusController = new PrivateStatusController();

    @Test
    public void privateStatusReturns200AndOk() {
        ResponseEntity<String> response = privateStatusController.privateStatus();
        Assertions.assertEquals("OK", response.getBody());
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());

    }
}
