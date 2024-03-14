package com.gigmanager.gigmanager.Controller;

import com.gigmanager.gigmanager.Service.UserService;
import com.gigmanager.gigmanager.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    public boolean login(User user) {
        return service.login(user);
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public User register(User user) {
        return service.create(user);
    }

}
