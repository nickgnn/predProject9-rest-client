package ru.javamentor.predProject9_rest_client.domain;

import java.util.Objects;

public class User {
    private Long id;
    private String username;
    private String password;
    private Integer age;
    private String role;
    private Long role_id;

    public User() {}

    public User(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public User(Long id, String name, String password) {
        this.id = id;
        this.username = name;
        this.password = password;
    }

    public User(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public User(String name, String password, Integer age, String role) {
        this.username = name;
        this.age = age;
        this.password = password;
        this.role = role;
    }

    public User(Long id, String username, String password, Integer age, String role) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.password = password;
        this.role = role;
    }

    public User(Long id, String username, String password, Integer age, String role, Long role_id) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.password = password;
        this.role = role;
        this.role_id = role_id;
    }

    public User(String username, String password, Integer age, String role, Long role_id) {
        this.username = username;
        this.age = age;
        this.password = password;
        this.role = role;
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", role_id=" + role_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUsername(), user.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
}
