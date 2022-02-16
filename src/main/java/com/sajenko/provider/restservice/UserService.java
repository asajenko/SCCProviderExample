package com.sajenko.provider.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserService {

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Long id) {
        return new User(id, "Adam");
    }

    @GetMapping
    public List<User> getAllUsers() {
        return List.of(new User(1L, "Adam"), new User(2L, "Tomek"));
    }
}

