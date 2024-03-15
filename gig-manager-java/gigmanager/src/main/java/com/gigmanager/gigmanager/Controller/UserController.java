package com.gigmanager.gigmanager.Controller;

import com.gigmanager.gigmanager.Service.UserService;
import com.gigmanager.gigmanager.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/login")
@CrossOrigin
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    public boolean login(@RequestBody User user) {
        return service.login(user);
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public User register(User user) {
        return service.create(user);
    }

}
