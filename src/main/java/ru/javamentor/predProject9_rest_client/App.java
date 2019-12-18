package ru.javamentor.predProject9_rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.javamentor.predProject9_rest_client.service.UserService;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        UserService userService = ctx.getBean(UserService.class);

        userService.getAllUsers().forEach(System.out::println);
    }
}
