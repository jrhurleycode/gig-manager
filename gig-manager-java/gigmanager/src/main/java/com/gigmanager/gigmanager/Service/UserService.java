package com.gigmanager.gigmanager.Service;

import com.gigmanager.gigmanager.Repository.UserRepository;
import com.gigmanager.gigmanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // create user
    public User create(User user) {
        return repository.save(user);
    }


    // login user
    public boolean login(User user) {
        return repository.existsById(user.getUser_Id());
    }

    // delete user....as admin??
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
