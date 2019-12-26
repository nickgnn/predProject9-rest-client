package ru.javamentor.predProject9_rest_client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.javamentor.predProject9_rest_client.domain.User;

import java.util.List;

@Service
public class UserServiceRest implements UserService {
    private RestTemplate restTemplate;
    private String serverUrl;

    @Autowired
    public UserServiceRest(RestTemplate restTemplate, @Value("${serverUrl}") String serverUrl) {
        this.restTemplate = restTemplate;
        this.serverUrl = serverUrl;
    }

    @Override
    public List<User> getAllUsers() {
        return restTemplate.exchange(
                serverUrl + "/admin",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() {
                }
        ).getBody();
    }

    @Override
    public User getOneUser(Long id) {
        return restTemplate.exchange(
                serverUrl + "/admin/" + String.valueOf(id),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<User>() {
                }
        ).getBody();
    }

    @Override
    public User createUser(User user) {
        return restTemplate.postForObject(
                serverUrl + "/admin",
                new HttpEntity<>(user),
                User.class);
    }

    @Override
    public User updateUser(Long id, User user) {
        restTemplate.put(serverUrl + "/admin/" + String.valueOf(id), user);

        return getOneUser(id);
    }

    @Override
    public void deleteUser(Long id) {
        restTemplate.delete(serverUrl + "/admin/" + String.valueOf(id));
    }
}