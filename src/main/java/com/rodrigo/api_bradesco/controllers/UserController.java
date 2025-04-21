package com.rodrigo.api_bradesco.controllers;


import java.util.List;

import com.rodrigo.api_bradesco.entities.User;
import com.rodrigo.api_bradesco.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }

}