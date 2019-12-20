package ru.javamentor.predProject9_rest_client.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.javamentor.predProject9_rest_client.domain.User;

@Controller
public class AdminController {
    @PostMapping("/adminRest")
    public ResponseEntity<User> getReq(@RequestBody User user) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
