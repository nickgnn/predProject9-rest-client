package ru.javamentor.predProject9_rest_client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.javamentor.predProject9_rest_client.domain.User;
import ru.javamentor.predProject9_rest_client.service.UserService;

@Controller
public class UserListController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());

        return "users";
    }

    @GetMapping("/oneUser")
    @ResponseBody
    public User getUserById(Long Id, Model model ) {
        model.addAttribute("oneUser", userService.getOneUser(Id));

        return userService.getOneUser(Id);
    }

    @RequestMapping(value="/save", method = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.GET})
    public String updateUser(User user) {
        userService.updateUser(user.getId(), user);

        return "redirect:/users";
    }

    @RequestMapping(value="/addNew", method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    public String addUser(User user) {
        userService.createUser(user);

        return "redirect:/users";
    }

    @RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET})
    public String deleteUser(Long Id) {
        userService.deleteUser(Id);

        return "redirect:/users";
    }
}