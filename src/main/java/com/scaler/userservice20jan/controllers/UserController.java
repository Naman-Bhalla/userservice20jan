package com.scaler.userservice20jan.controllers;

import com.scaler.userservice20jan.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    // GET /users/1
    @GetMapping("/{id}")
    public User getUserDetails(@PathVariable("id") Long id) {
        return new User();
    }
}
