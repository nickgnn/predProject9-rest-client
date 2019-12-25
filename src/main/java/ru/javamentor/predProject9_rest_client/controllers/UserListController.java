package ru.javamentor.predProject9_rest_client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javamentor.predProject9_rest_client.service.UserService;

@Controller
@RequestMapping("users")
public class UserListController {
    @Autowired
    UserService userService;

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());

        return "users";
    }
}
