package ru.javamentor.predProject9_rest_client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javamentor.predProject9_rest_client.domain.User;
import ru.javamentor.predProject9_rest_client.service.UserService;

@Controller
@RequestMapping("users")
public class AdminController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<User> getReq(@RequestBody User user) {
        User oneUser = userService.getOneUser(user.getId());

        return new ResponseEntity<>(oneUser, HttpStatus.OK);
    }

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());

        return "users";
    }

}
