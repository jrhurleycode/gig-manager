package com.gigmanager.gigmanager.Service;

import com.gigmanager.gigmanager.Repository.UserRepository;
import com.gigmanager.gigmanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
        System.out.println(user.getUser_id());
        return repository.existsById(user.getUser_id());

    }

    // delete user....as admin??
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
