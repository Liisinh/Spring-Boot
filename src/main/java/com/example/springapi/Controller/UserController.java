package com.example.springapi.Controller;

import com.example.springapi.Model.User;
import com.example.springapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/API/User")

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping()
    public User getUser(@RequestParam Integer id) {
        Optional User = userService.getUser(id);
        if (User.isPresent()) {
            return (User) User.get();
        }
        return null;
    }
}
