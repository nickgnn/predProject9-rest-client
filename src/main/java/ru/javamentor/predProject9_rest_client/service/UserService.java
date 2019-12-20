package ru.javamentor.predProject9_rest_client.service;

import ru.javamentor.predProject9_rest_client.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getOneUser(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}